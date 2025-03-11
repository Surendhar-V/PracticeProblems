package javaProblems;/*

TIME  COMPLEXITY - O(m*n*n)
SPACE COMPLEXITY - O(m*m)



where n -word.length
      m -arr.length

 */


import java.util.HashMap;

public class countconstruct_memo  {

    public static void main(String[] args){

        HashMap<String,Integer > memo = new HashMap<>();
        System.out.println(solution("abcdef","",new String[]{"abc","ab","cd","def","abcd"},memo));
        memo.clear();
        System.out.println(solution("skateboard","",new String[]{"bo","rd","ate","t","sha","sk","boar"},memo));
        memo.clear();
        System.out.println(solution("enterapotentpot","",new String[]{"a","p","ent","enter","ot","o","t"},memo));
        memo.clear();
        System.out.println(solution("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef","",new String[]{"e","ee","eee","eeee","eeeee","eeeeee"},memo));
        memo.clear();
        System.out.println(solution("purple","",new String[]{"purp","p","ur","le","purpl"},memo));
        memo.clear();
    }

    private static int solution(String s,String newstring,String[] arr,HashMap<String,Integer> memo){

        int count=0;

        if(memo.containsKey(newstring)){
            return memo.get(newstring);
        }
        if(canproceed(s,newstring)==2){
            return 1;
        }
        else if(canproceed(s,newstring)==0){
            return 0;
        }


        for(int i =0;i<arr.length;i++){
            int temp = solution(s,newstring+arr[i],arr,memo);
            if(temp!=0){
                count+=temp;
                memo.put(newstring,count);
            }

        }
        memo.put(newstring,count);
        return count;

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
