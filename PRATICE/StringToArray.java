public class StringToArray {
    public static void main(String[] args) {
        String mystr = "Java Programming";
        char[] myarray=mystr.toCharArray();
        System.out.println(myarray[3]);

        for(char i:myarray)
        System.out.print(i);
    }
}
