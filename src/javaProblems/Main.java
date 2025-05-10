package javaProblems;

class Main {

    public static void main(String[] args) {

        int[] nums1 = {2,0,2,0};
        int[] nums2 = {1,4};
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
        long end = Long.MAX_VALUE - start;
        long res = 0;
        int max = Math.max(sum1, sum2);
        int min = Math.min(sum1 , sum2);
        int maxZeros = (max == sum1) ? zeros1 : zeros2;
        int minZeros = (min == sum1) ? zeros1 : zeros2;

        while (start <= end) {
            long mid = (start + end) / 2;
            if(mid <=0){
                break;
            }
            max = Math.max(sum1, sum2);
            maxZeros = (max == sum1) ? zeros1 : zeros2;
            min = Math.min(sum1 , sum2);
            minZeros = (min == sum1) ? zeros1 : zeros2;

            boolean separated = canSeparated(zeros1, zeros2, mid, max , maxZeros , min , minZeros);
            if (separated) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return canSeparated(zeros1, zeros2, res, Math.max(sum1, sum2), maxZeros, min, minZeros) ? res : -1;
    }

    private boolean canSeparated(int zeros1, int zeros2, long sum, int max, int maxZeros, int min, int minZeros) {
        if (zeros1 == 0 && zeros2 == 0) {
            return false;
        } else if (sum < zeros1 || sum < zeros2) {
            return false;
        } else if (sum >= max+maxZeros && sum >= min + minZeros) {
            return true;
        }
        return false;
    }

}