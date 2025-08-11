package Assignment5;
//3.	Check If a String Is Empty
import java.util.function.Predicate;
public class Emptystring {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        String str1 = "";
        String str2 = "Hello";
        System.out.println("Is str1 empty? " + isEmpty.test(str1));  
        System.out.println("Is str2 empty? " + isEmpty.test(str2));  
    }
}
