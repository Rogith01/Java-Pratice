import java.util.*;
public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The Square Root of "+ num +" is "+ Math.sqrt(num));
        sc.close();
    }
}