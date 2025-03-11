package javaProblems;

import java.util.Arrays;

public class allconstruct {
    public static void main(String[] args) {


        System.out.println(Arrays.deepToString(solution("purple","",new String[]{"purp","p","ur","le","purpl"})));
        System.out.println(Arrays.deepToString(solution("enterapotentpot","",new String[]{"a","p","ent","enter","ot","o","t"})));


    }

    public static String[][] solution(String target , String newstring  ,String[] wordbank){


        if(canproceed(target,newstring)==2){
            return new String[][] {{}};
        }
        if(canproceed(target,newstring)==0){
            return null;
        }

        String[][] result = {};


        for(int i =0;i<wordbank.length;i++) {

            String[][] temp =solution(target,newstring+wordbank[i],wordbank);

            if(temp!=null){

                String[][] add_arr=add(wordbank[i],temp);
                result=separate_store(result,add_arr);

            }

        }
        return result;

    }

    private static String[][] add(String word,String[][] arr)
    {

        String[][] mix=new String[arr.length][];

        //declaring the column size
        for(int i=0;i<arr.length;i++)
        {

            mix[i]=new String[arr[i].length+1];

        }



        //adding the word for all the subarrays in the arr
        for(int i=0;i<mix.length;i++){
            for(int j=0;j<mix[i].length;j++) {

                if(j==0) {


                    mix[i][j]=word;

                }
                else{

                    mix[i][j]=arr[i][j-1];

                }
            }


        }


        return mix;

    }



    private static String[][] separate_store(String[][] arr , String[][] result ){


        String[][] mix = new String[arr.length+result.length][];

        for(int i =0;i<result.length;i++)
        {
            mix[i]=new String[result[i].length];

        }


        for(int i =result.length;i<arr.length+result.length;i++)
        {
            mix[i]=new String[arr[i-(result.length)].length];

        }




        //at first we copy the element of the result array to mix;


        for(int i=0;i<result.length;i++){
            System.arraycopy(result[i], 0, mix[i], 0, result[i].length);
        }



        for(int i=result.length;i<arr.length+result.length;i++){
            System.arraycopy(arr[i - (result.length)], 0, mix[i], 0, arr[i - (result.length)].length);
        }


        return mix;

    }

    private static int canproceed(String s , String newstring){


        int i=0;
        int j=0;
        while(i!=newstring.length() && j!=s.length()){

            if(newstring.charAt(i) != s.charAt(j)){
                break;
            }

            i++;
            j++;
        }



        if(i==newstring.length() && j==s.length()){
            return 2; // reached the string
        }

        if(i<newstring.length()){
            return 0; //not to continue
        }
        return 1;       //continue

    }


}







