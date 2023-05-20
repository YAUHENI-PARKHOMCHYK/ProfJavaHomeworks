package lesson5;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {


        Map<String, Integer> house = new java.util.HashMap<>();
        house.put(" John", 1);
        house.put("Joanna",1);
        house.put("Mike", 2);
        house.put("Bill", 3);
        house.put("TJ",3);
        System.out.println(house);
        System.out.println(house.get("Mike"));

    }
}
