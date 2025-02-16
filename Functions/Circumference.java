import java.util.Scanner;

// public class Circumference {
//     public static double getCircumference(double radius){
//         return 2*3.14*radius;
//     }
     
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double radius=sc.nextDouble();
//         System.out.println(getCircumference(radius));
//         sc.close();
//     }
// }

public class Circumference {
    public static void getCircumference(double radius){
        double area = 2*3.14*radius;
        System.out.println(area);
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius=sc.nextDouble();
        getCircumference(radius);
        sc.close();
    }
}
