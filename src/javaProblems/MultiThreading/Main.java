package javaProblems.MultiThreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Printdata obj=new Printdata();

        Thread obj1 = new Thread(new Thread1(obj));
        obj1.start();

        Thread obj2 = new Thread(new Thread2(obj));
        obj2.start();


    }








}
class Printdata {

     public void Print(String Name) {

        for (int i = 0; i < 10; i++) {
            System.out.println(Name);
        }

    }


}

class Thread1 implements Runnable {

    Printdata obj;

    Thread1(Printdata obj) {
        this.obj = obj;
    }

    @Override
    synchronized public void run() {

        obj.Print("Thread 1");

    }


}

class Thread2 implements Runnable {

    Printdata obj;

    Thread2(Printdata obj) {
        this.obj = obj;
    }

    @Override
    synchronized public void run() {

        obj.Print("Thread 2");

    }

}