package javaProblems;

public class findmedian {


    public static void main(String[] args){

        int[] arr = {1 , 5, 8 , 10 ,18 ,20};
        int[] brr = {2 , 3 ,6 ,7};


        System.out.println(findmedian(arr , brr));

    }


    public static int findmedian(int[] arr , int[] brr){


        int start = 1 ;
        int end =  arr.length ;

        while(start <= end){


            int cut1 = (start + end )/2;
            int cut2 = ((arr.length+brr.length)/2) -cut1;

            int l1 = cut1==0 ? Integer.MIN_VALUE : arr[cut1-1];
            int l2 = cut2==0 ? Integer.MIN_VALUE : brr[cut2-1];
            int r1 = cut1==arr.length ? Integer.MAX_VALUE : arr[cut1];
            int r2 = cut2==brr.length ? Integer.MAX_VALUE : brr[cut2];


//            l1<r2
//            l2<r1

            if(l1 >r2){
                end = cut1-1;
            }
            else if(l2 > r1){
                start = cut1+1;
            }
            else{
                return (arr.length+brr.length)%2==0 ? (Math.max(l1 , l2) + Math.min(r1 ,r2))/2 : Math.min(r1,r2) ;
            }




        }



        return -1 ;
    }

}
