package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(9);
        set.add(2);
        set.add(5);
        set.add(10);
        set.add(1);

        System.out.println(set);

        // set.remove(1);
        // System.out.println(set);

        // if(set.contains(1)){
        //     System.out.println("contains");
        // }
        // else{
        //     System.out.println("not");
        // }

        // if(!set.contains(9)){
        //     System.out.println("not contain");
        // }

        Iterator<Integer> it = set.iterator();
        System.out.println(it);

        while(it.hasNext()){
            System.out.println(it.next());
        }
        



    }

}
