/*

Here we are using Object class for the following reason.


Java complies a code and store it in the form of byte code .
and in the run time , it runs the byte code and execute the output .


if the generic is specifed in the object which will be executed only in the run time  ,
 java confuses itself , while coverting the code into byte code while compiling

The type of the variable will not be specified in the byte code so , it will become confused while in the execution.
Thats why we are using the Object class .

It simply means we , can store the element either in   INTEGER , FLOAT , STRING  or LONG .....

 */



/*

We can make it more generic ( type restricted ) using extends keyword .

 public class Java.arraylist <T extends number >

It is known as WILDCARDING .

:)

 */

package javaProblems.arraylist;

import java.util.Arrays;

public class arraylist<T> {

    int size = 2 ;
    T element ;
    Object[] arr ;
    int i = 0;
    public arraylist(){
        arr = new Object[size];
    }

    public void add(Object element){

    if(i>= size){
        arr = copyelements( arr );
        size*=2;
    }
        arr[i] = element;
        i++;
    }

    private Object[] copyelements(Object[] arr) {
        Object[] brr = new Object[(int) (size*0.5)];
        System.arraycopy(arr, 0, brr, 0, arr.length);
        return brr ;
    }




        @Override
        public String toString() {
            return "Java.arraylist{" +
                    "size=" + i +
                    ", arr=" + Arrays.toString(arr) +
                    '}';
        }



}
