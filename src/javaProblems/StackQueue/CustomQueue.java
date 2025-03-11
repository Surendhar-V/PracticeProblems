package javaProblems.StackQueue;

public class CustomQueue<T> {


    protected int first=0;
    protected int last=0;
    public int size=0;
    protected  static Object[] data;
    static final int DEFAULT_SIZE=10;
    CustomQueue(){


        data=new Object[DEFAULT_SIZE];
    }

    CustomQueue(int size){

        data=new Object[size];
    }

    public void add(T element) throws Exception{

            if(isFull()){
                throw new Exception("Queue is full");
            }

            data[last++]=element;
            last=last%data.length;
            size++;

    }
    public Object poll() throws Exception{


        if(isEmpty()){
            throw new Exception("There is no element to poll");
        }
        size--;
        return data[first++];


    }
    public void removeAll()
    {
        size=0;
    }
    @Override
    public String toString() {

        if(size==0){
            return "[]";
        }
        System.out.print("[ ");
        for(int i=first;i<first+size-1;i++){

            i=i%data.length;
            System.out.print(data[i]+" , ");

        }
        System.out.print(data[first+size-1]);
        System.out.print(" ]");


        return "\t";
    }

    public boolean isFull(){
        return this.size==data.length;
    }

    public boolean isEmpty()
    {
        return this.size==0;
    }


}