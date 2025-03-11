package javaProblems.Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pairing {
    public static void main(String[] args) {
        List<String> keys= Arrays.asList("Surendhar" , "Hari" , "Deepak");
        List<String> values = Arrays.asList("Sowmiya" , "Hema" , "Sarithra");

        Map<String , String> map = IntStream.range(0 , keys.size())
                .boxed().collect(Collectors.toMap(i-> keys.get(i) , i -> values.get(i) ,
                        (exisiting , replacement ) -> exisiting , LinkedHashMap:: new));

        System.out.println(map);

    }
}
