package Patterns_Program;
public class Pattern18 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
