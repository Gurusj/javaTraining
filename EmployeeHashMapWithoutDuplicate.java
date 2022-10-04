package org.example;

import java.util.HashMap;
import java.util.Map;

class Amantya2{
    private int id;
    private String name;
    public Amantya2(int id, String name){
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

    public int hashCode(){
        int hashcode = 0;
        return hashcode;
    }

    public boolean equals(Object obj){
        if(obj instanceof Amantya2){
            Amantya2 emp = (Amantya2) obj;
            return (emp.name.equals(this.name) && emp.id == this.id);
        }else {
            return false;
        }
    }
}

public class EmployeeHashMapWithoutDuplicate {
    public static void main(String[] args){
        Map<Amantya2, Integer> map = new HashMap<Amantya2, Integer>();

        map.put(new Amantya2(1,"Abhi"), 1);
        map.put(new Amantya2(2,"Arun"), 2);
        map.put(new Amantya2(3,"Nidhi"), 3);
        map.put(new Amantya2(4,"Vayu"), 4);
        map.put(new Amantya2(5,"Virat"), 5);
        map.put(new Amantya2(1,"Abhi"), 1);

        System.out.println(map);

    }
}
