package Strings;

import java.util.Scanner;

public class CombineLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];

        int lengthCount = 0;

        for(int i=0;i<size;i++){
            array[i] = sc.nextLine();

            lengthCount = lengthCount+array[i].length();
        }
        System.out.println(lengthCount);
        sc.close();
    }
}
