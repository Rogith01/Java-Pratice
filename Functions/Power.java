import java.util.Scanner;

public class Power {
    public static int PowerOf(int n , int x){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(PowerOf(n, x));
        sc.close(); 
    }
}
