package Arrays;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list.reversed());

        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.add(1,2);
        System.out.println(list);

        list.set(0, 2);
        System.err.println(list);

        list.add(50);
        list.add(40);
        list.add(12);
        list.add(78);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
