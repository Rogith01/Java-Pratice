package Strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        
        char replace = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == replace){
                result = result+newChar;
            }
            else{
                result = result+str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
