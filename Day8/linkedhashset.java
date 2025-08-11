package Assignment8;

import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); // duplicate

        System.out.println("LinkedHashSet elements: " + numbers);
    }
}
