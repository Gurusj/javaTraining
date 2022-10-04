package org.example;

import java.util.HashMap;
import java.util.Map;

class Amantya{
    private int id;
    private String name;
    public Amantya(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Amantya{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeHashMapWithDuplicate {
    public static void main(String[] args){
        Map<Amantya, Integer> map = new HashMap<Amantya, Integer>();

        map.put(new Amantya(1,"Abhi"), 1);
        map.put(new Amantya(2,"Arun"), 2);
        map.put(new Amantya(3,"Nidhi"), 3);
        map.put(new Amantya(4,"Vayu"), 4);
        map.put(new Amantya(5,"Virat"), 5);
        map.put(new Amantya(1,"Abhi"), 1);

        System.out.println(map);

    }
}
