package Strings;

public class basicString {
    public static void main(String[] args) {
        String name1 = "Java";
        String name2 = "Programming";
        
        String total = name1+ " " +name2;  
        
        System.out.println(total);

        for(int i=-0;i<total.length();i++){
            System.out.print(total.charAt(i));
        }

        System.out.println();

        if(name1 == name2){
            System.out.println("eqauls");
        }
        else{
            System.out.println("not equals");
        }

        System.out.println(total.substring(3,8));
    }


}
