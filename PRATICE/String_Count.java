import java.util.*;
public class String_Count{
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)){
        System.out.println("Ennter the Words: ");
        String word=myObj.nextLine();
        int count=word.split("\\s").length;
        System.out.println(count);
        }
    }
}

