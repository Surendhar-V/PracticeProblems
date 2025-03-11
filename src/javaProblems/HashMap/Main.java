package javaProblems.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap map = new HashMap();

        map.put("Xpulse" , "Dream Bike");
        map.put("Zoho" , "Dream Company");
        map.put("Verna" , "Dream Car");

        System.out.println(map);
        System.out.println(map.get("Zoho"));
        System.out.println(map.get("ZOHO"));

    }

}
