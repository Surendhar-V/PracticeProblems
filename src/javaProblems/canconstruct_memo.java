package javaProblems;/*

TIME COMPLEXITY - O(m*n*n)
SPACE COMPLEXITY - O(m*m)



where n -word.length
      m -arr.length

 */


import java.util.HashMap;

public class canconstruct_memo {

    public static void main(String[] args){

        HashMap<String,Boolean > memo = new HashMap<>();
        System.out.println(solution("abcdef","",new String[]{"abc","ab","cd","def"},memo));
        memo.clear();
        System.out.println(solution("skateboard","",new String[]{"bo","rd","ate","t","sha","sk","boar"},memo));
        memo.clear();
        System.out.println(solution("enterapotentpot","",new String[]{"a","p","ent","enter","et","o","t"},memo));
        memo.clear();
        System.out.println(solution("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef","",new String[]{"e","ee","eee","eeee","eeeee","eeeeee"},memo));
        memo.clear();

    }

    private static boolean solution(String s,String newstring,String[] arr,HashMap<String,Boolean > memo ){



        if(memo.containsKey(newstring)){
            return memo.get(newstring);
        }
        if(canproceed(s,newstring)==2){
            return true;
        }
        else if(canproceed(s,newstring)==0){
            return false;
        }


        for(int i =0;i<arr.length;i++){

            if(solution(s,newstring+arr[i],arr,memo)){
                memo.put(newstring,true);
                return true;
            }
            else{
                memo.put(newstring,false);
            }
        }


        memo.put(newstring,false);
        return false;

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
