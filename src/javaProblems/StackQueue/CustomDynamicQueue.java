package javaProblems.StackQueue;

public class CustomDynamicQueue<T> extends CustomQueue<T> {

    @Override
    public void add(T element) throws Exception{

        if(isFull()){
            Object[] newdata=new Object[size*2];


            for(int i=first;i<=first+size-1;i++){
                i=i%data.length;
                newdata[i]=data[i];
            }

            data=newdata;


        }

        last=first+size;
        super.add(element);


    }





}
