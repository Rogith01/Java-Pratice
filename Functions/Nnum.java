import java.util.*;
public class Nnum {
    public static void NaturalSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of " + n +" natural number is: "+sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NaturalSum(n);
        sc.close();
    }
}
