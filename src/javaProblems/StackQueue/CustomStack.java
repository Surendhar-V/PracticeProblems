package javaProblems.StackQueue;

public class CustomStack<E> {


    protected Object[] data;
    private static final int DEFAULT_SIZE =10;
    static int ptr =-1;
    protected int size;
    public CustomStack(){
        this(DEFAULT_SIZE);

        this.size=DEFAULT_SIZE;


    }



    public CustomStack(int size){
        this.size=size;
        this.data=  new Object[size];
    }

    public void push(E element) throws Exception{


            if (ptr <= 10) {

                data[++ptr] = element;

            }
            else {

                throw new Exception("Stack is full. The item can't be added");
            }

    }

    public Object pop() throws Exception{


        if( ptr<=10 && ptr!=-1){
            return data[ptr--] ;

        }
        else{
            throw new Exception("The stack is empty . Nothing can be poped");
        }



    }

    public void removeAll(){

        data=new Object[size];
        ptr=-1;

    }

    public Object peek(){
        return data[ptr];
    }

    @Override
    public String toString() {

        System.out.print("[ ");
        for(int i=ptr;i>=1;i--){
            System.out.print(data[i]+" , ");
        }
        System.out.print(data[0]);
        System.out.print(" ]");
        return "\t";

    }


    public boolean isFull(){
        return ptr == 10;
    }



}
