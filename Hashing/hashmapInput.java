package Hashing;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmapInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String , Integer> map = new HashMap<>();

        // size
        int n = sc.nextInt();
        

        // user entries

        for(int i = 0;i<n;i++){

            // String
            String str = sc.next();
            Integer num = sc.nextInt();
            

            map.put(str,num);
            
        }
        System.out.println(map);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        sc.close();
    }
}
