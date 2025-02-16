import java.util.Scanner;

public class Num_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number=sc.nextLine();
        String reverse_num="";
        for(int i=0;i<number.length();i++){
            reverse_num=number.charAt(i)+reverse_num;
        }
        int original=Integer.parseInt(reverse_num);
        System.out.println("The reversed number is :"+original);
        sc.close();
    }
    
}
