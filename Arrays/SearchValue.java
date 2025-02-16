package Arrays;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number you want to search: ");
        int x = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == x){
                System.out.println("The element found in the index of: "+i);
            }
        }
        sc.close();
    }
    
}
