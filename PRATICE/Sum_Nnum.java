// import java.util.*;
// public class Sum_Nnum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i = 1 ; i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }

import java.util.*;
public class Sum_Nnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}