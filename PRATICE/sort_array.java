import java.util.*;

public class sort_array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        // Collections.reverseOrder(); //Collections.reverseOrder() for descending
        for(int i = 0; i<cars.length;i++){
            System.out.print(cars[i]+" ");
        }

        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Volvo");
        // list.add("BMW");
        // list.add("Tesla");

        // Collections.sort(list);
        // System.out.println(list);

        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
    }
}
