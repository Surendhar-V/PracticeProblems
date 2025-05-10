package javaProblems;

class Main {

    public static void main(String[] args) {

        int[] nums1 = {3,2,0,1,0};
        int[] nums2 = {6,5,0};
        Main main = new Main();
        System.out.println(main.minSum(nums1, nums2));

    }

    public long minSum(int[] nums1, int[] nums2) {

        int sum1 = 0;
        int sum2 = 0;
        int zeros1 = 0;
        int zeros2 = 0;

        for (int i : nums1) {
            if (i == 0) {
                zeros1++;
            } else {
                sum1 += i;
            }
        }

        for (int i : nums2) {
            if (i == 0) {
                zeros2++;
            } else {
                sum2 += i;
            }
        }

        long start = Math.min(sum2, sum1);
        long end = Integer.MAX_VALUE/30 - start ;
        long res = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            if(mid <=0){
                break;
            }
            boolean separated = canSeparated(sum1 , sum2 , mid , zeros1 , zeros2);
            if (separated) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return canSeparated(sum1 , sum2 , res , zeros1 , zeros2) ? res : -1;
    }

    private boolean canSeparated(int sum1, int sum2, long mid, int zeros1, int zeros2) {

        if (zeros1 == 0 && zeros2 == 0 && sum1 != sum2) {
            return false;
        }else if(zeros1 == 0 && zeros2 == 0){
            return true;
        }

        long leftExtras = (mid - sum1);
        if(leftExtras < 0L){ return false; }

        long rightExtras = (mid - sum2);
        if(rightExtras <0L){ return false; }

        long leftSum = 0;

        if(zeros1 != 0) {
            leftSum = zeros1 * (leftExtras / zeros1) + leftExtras % zeros1;
        }

        long rightSum = 0;

        if(zeros2 != 0) {
            rightSum = zeros2 * (rightExtras / zeros2) + rightExtras % zeros2;
        }

        if(leftSum < 0L){ return false; }
        if(rightSum < 0L){ return false; }


        if(leftSum+sum1 == rightSum+sum2){
            return true;
        }

        return false;
    }

}