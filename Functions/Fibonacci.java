import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciSeries(int n){
        long a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            if(i<n){
                System.out.print(" ");
            }
            long temp=b;
            b= a + b;
            a = temp;
            }
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
        sc.close();
    }
}
