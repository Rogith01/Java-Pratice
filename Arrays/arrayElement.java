package Arrays;
import java.util.*;

public class arrayElement{
    public static void main(String[] args) {
        
  
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];

    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }

    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
    sc.close();
}
}
