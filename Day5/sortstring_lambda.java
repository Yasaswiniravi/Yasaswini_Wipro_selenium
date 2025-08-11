package Assignment5;
import java.util.*;
public class sortstring_lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Kiwi", "Mango", "Orange");
        List<String> byLength = new ArrayList<>(names);
        byLength.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by Length: " + byLength);
        List<String> alphabetically = new ArrayList<>(names);
        alphabetically.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Alphabetically: " + alphabetically);
    }
}