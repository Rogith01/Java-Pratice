package Sorting;

import java.util.Scanner;

public class BubbleSort {

    // public static void printArray(int arr[]){
    //     System.out.print("[");
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //         if(i<arr.length-1){
    //             System.err.print(",");
    //         }
    //     }
    //     System.out.println("]");
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        sc.close();
        

    }
}
