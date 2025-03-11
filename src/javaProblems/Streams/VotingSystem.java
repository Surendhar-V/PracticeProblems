package javaProblems.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class VotingSystem {

    public static void main(String[] args) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        HashMap<Character, Character> map3 = new HashMap<>();

        map1.put('P', 'A');
        map1.put('Q', 'A');
        map1.put('R', 'B');
        map1.put('S', 'C');

        map2.put('L', 'B');
        map2.put('M', 'A');
        map2.put('N', 'C');
        map2.put('O', 'B');

        map3.put('T', 'C');
        map3.put('U', 'B');
        map3.put('V', 'B');
        map3.put('W', 'C');

        List<HashMap<Character, Character>> listOfMap = Arrays.asList(map1, map2, map3);

        Map<Object , Long> map = listOfMap.stream().flatMap(i -> i.entrySet().stream()).collect(Collectors.groupingBy(entry -> entry.getValue() , Collectors.counting()));
        System.out.println(map);

       // map.entrySet().stream().collect(Collectors.groupingBy();
    }

}