package javaProblems.Streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class  MapSort {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map1 = new HashMap<>();

        map1.put(1,2);
        map1.put(5,1);
        map1.put(7,3);
        map1.put(2,6);
        map1.put(9,3);

        HashMap<Integer ,Integer> newMap = map1.entrySet().stream().sorted((i , j) -> i.getKey()-j.getKey())
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (existing , replacement) -> existing,
                        LinkedHashMap::new ));

        System.out.println(newMap);
    }
}
