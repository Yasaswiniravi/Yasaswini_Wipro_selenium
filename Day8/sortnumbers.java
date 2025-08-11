package Assignment8;

import java.util.ArrayList;
import java.util.Collections;
public class sortnumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(9);
        numbers.add(56);
        numbers.add(31);
        Collections.sort(numbers);
        System.out.println("Sorted list (Ascending): " + numbers);
    }
}
