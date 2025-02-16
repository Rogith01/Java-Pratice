package Arrays;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }

        if(isAscending){
            System.out.println("Ascending order");
        }
        else{
            System.out.println("Not Ascending order");
        }
        sc.close();
    }
    
}
