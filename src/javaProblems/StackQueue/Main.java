package javaProblems.StackQueue;

import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws Exception {

//        Stack<Object> stack = new Stack<>();
//
//
//        stack.push(3);
//        stack.push(58);
//        stack.push("Surendhar");
//        stack.push(1);
//        stack.push('u');
//        stack.push(87.0f);
//
//        printstack(stack);
//
//        Queue<Object> queue= new LinkedList<>();
//        queue.add(3);
//        queue.add(58);
//        queue.add("Surendhar");
//        queue.add(1);
//        queue.add('u');
//        queue.add(87.0f);
//
//        System.out.println("\nStack ends\n");
//        printqueue(queue);



//        Deque<Object> deck=new LinkedList<>();
//        deck.add("surendhar");
//        deck.push("suren");
//        deck.push("any name");
//        System.out.println(deck);
//
//CustomStack<Integer> stack = new CustomStack<>();
//
//stack.push(5);
//stack.push(6);
//stack.push(4);
//stack.push(98);
//stack.push(3);
//stack.push(6);
//stack.push(23);
//stack.push(54);
//stack.push(21);
//stack.push(6);


      //  System.out.println("");
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());

//        System.out.println(stack);

//
//        CustomQueue<Integer>queue=new CustomQueue<>();
//
//        queue.add(3);
//        queue.add(322);
//        queue.add(3325423);
//        queue.add(12353);
//        queue.add(345345);
//        queue.add(14353);
//        queue.add(235576);
//        queue.add(7456);
//        queue.add(56737);
//        queue.add(256876);
//
//        queue.add(5484597);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//
//        System.out.println(queue);
//        System.out.println(queue.size);
//        queue.removeAll();
//        queue.poll();
//        System.out.println(queue);
//        System.out.println("Item removed");


        CustomDynamicQueue<Integer> queue=new CustomDynamicQueue<>();

        queue.add(322);
        queue.add(3325423);
        queue.add(12353);
        queue.add(345345);
        queue.add(14353);
        queue.add(235576);
        queue.add(7456);
        queue.add(56737);
        queue.add(256876);

        queue.add(12345678);
        queue.add(987654);
        queue.add(2345);
        queue.add(8765444);
        queue.add(23454443);

        System.out.println(queue);

    }




    private static  void printqueue(Queue<Object>queue){



        if(queue.size()==0){
            return;
        }
        System.out.println(queue.remove());
        printqueue(queue);

    }


    public static void printstack(Stack< ? > stack){

        if(stack.size()==0){
            return ;
        }

        System.out.println(stack.pop()+",");


        printstack(stack);


    }


}
