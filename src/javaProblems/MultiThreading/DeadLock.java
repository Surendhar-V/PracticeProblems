package javaProblems.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    private int count = 0;
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void increment1() {
        System.out.println(Thread.currentThread().getName() + "Entered increment1");
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + " is holding lock1 in increment1");
        try {
            Thread.sleep(100);
            lock2.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is holding lock2 in increment1");
                count++;
            } finally {
                lock2.unlock();
                System.out.println(Thread.currentThread().getName() + " released lock2 in increment1");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock1.unlock();
            System.out.println(Thread.currentThread().getName() + " released lock1 in increment1");
        }
    }

    public void increment2() {
        System.out.println(Thread.currentThread().getName() + "Entered increment2");
        lock2.lock();
        System.out.println(Thread.currentThread().getName() + " is holding lock2 in increment2");
        try {
            Thread.sleep(100);
            lock1.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is holding lock1 in increment2");
                count++;
            } finally {
                lock1.unlock();
                System.out.println(Thread.currentThread().getName() + " released lock1 in increment2");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock2.unlock();
            System.out.println(Thread.currentThread().getName() + " released lock2 in increment2");
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        DeadLock counter = new DeadLock();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(counter::increment1);
        Thread thread2 = new Thread(counter::increment2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
