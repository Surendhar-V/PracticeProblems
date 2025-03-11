package javaProblems;

public class ceiling_char {
    public static void main(String[] args) {

        char[] arr= {'c','f','j'};
        char search = 'a';
        System.out.println(ceiling(arr,search));



    }
public static char ceiling(char[] arr, char search){
        int start = 0;
        int end = arr.length-1;


        while(start<=end){

            int  mid = (start+end) /2;

            if(arr[mid]>search){
                end = mid-1;}
            else if(arr[mid]<search){
                start = mid+1; }
            else {
                if(mid==arr.length-1){
                    return '\0';
                }
                else {
                    return arr[mid + 1];
                }
            }

        }
        return '\0';

}
}
