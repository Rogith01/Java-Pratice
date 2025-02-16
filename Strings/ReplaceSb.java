package Strings;

import java.util.Scanner;

public class ReplaceSb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char replace = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == replace){
                sb.setCharAt(i, newChar);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
