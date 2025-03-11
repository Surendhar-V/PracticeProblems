package javaProblems.StackQueue;

public class CustomDynamicStack<E> extends CustomStack<E> {


    @Override
    public void push(E element) throws Exception {

        if (isFull()) {
            Object[] newarr = new Object[size * 2];

        } else {
            super.push(element);

        }
    }

}
