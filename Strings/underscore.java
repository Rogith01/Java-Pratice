package Strings;

import java.util.Scanner;

public class underscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String reverse = "";

        for(int i =0;i<word.length();i++){
            if(word.charAt(i) == '_'){
                break;
            }
            reverse = word.charAt(i)+reverse;
        }
        int second = word.indexOf('_');
        if(second != -1){
            reverse = reverse+word.substring(second);
        }

        System.out.println(reverse);
        sc.close();
    }
}
