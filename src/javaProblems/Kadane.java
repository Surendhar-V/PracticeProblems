package javaProblems;

class Kadane{

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(Kadane(arr));

    }

    public static int Kadane(int[] arr) {

        int max = Integer.MIN_VALUE;
        int temp = 0;

        for(int i =0 ; i<arr.length ; i++) {

            temp+=arr[i];

            if(temp < arr[i]){
                temp = arr[i];
            }

            if(temp > max){
                max = temp;
            }

        }

        return max;
    }

}