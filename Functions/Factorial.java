import java.util.Scanner;

public class Factorial {
    public static int PrintFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PrintFactorial(n));
        sc.close();
    }
}
