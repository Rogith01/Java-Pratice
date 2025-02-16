import java.util.Scanner;

public class Eligible {
    public static boolean isEligible(int n){
        if(n>=18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEligible(n));
        sc.close();
    }
}
