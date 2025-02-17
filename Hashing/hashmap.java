package Hashing;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        // updation
        map.put("China",180);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

        // value 

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Iteration 1
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        
    }
}
