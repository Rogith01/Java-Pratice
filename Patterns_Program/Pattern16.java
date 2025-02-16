package Patterns_Program;

public class Pattern16 {
    public static void main(String[] args) {
        int n =4;
        //upper 

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
