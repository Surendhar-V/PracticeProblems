package javaProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5};

        func(nums1, nums2, nums3);

    }

    public static List<Integer> func(int[] nums1, int[] nums2, int[] nums3) {

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(nums1).forEach(num -> map.put(num, 1));
        Arrays.stream(nums2).forEach(num -> {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        });
        Arrays.stream(nums3).forEach(num -> {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        });

        System.out.println(map);

        return null;
    }

}