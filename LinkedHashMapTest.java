package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String arge[]){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(4, "Abhishek");
        map.put(7, "Nikhil");
        map.put(2, "Preveen");
        map.put(5, "Vikas");
        map.put(9, "Saru");
        map.put(1, "Suri");
        map.put(3, "Vinod");
        map.put(8, "Ayushi");
        map.put(8, "Ayushi");

        System.out.println(map);
        System.out.println(map.get(5));
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            String value = entry.getValue();
            if(value.equals("Ayushi")){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}

