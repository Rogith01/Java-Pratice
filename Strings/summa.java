package Strings;

import java.util.Scanner;

public class summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        // System.out.println(sb);

        int result = Integer.parseInt(sb.toString());
        System.out.println(result);
        sc.close();
        
    }
}
