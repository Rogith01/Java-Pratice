package Strings;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String Username = "";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                Username = Username+email.charAt(i);
            }
        }
        System.out.println(Username);
        sc.close();
    }
}
