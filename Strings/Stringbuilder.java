package Strings;

public class Stringbuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Rogith");
        System.out.println(sb);


        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(0,'s');
        System.out.println(sb);

        sb.delete(1,4);
        System.out.println(sb);

        sb.append('e');
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
