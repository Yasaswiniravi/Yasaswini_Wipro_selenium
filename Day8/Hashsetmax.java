package Assignment8;

import java.util.*;
public class Hashsetmax {
    public static int getMax(HashSet<Integer> set) {
        return Collections.max(set);
    }
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);
        System.out.println("Max: " + getMax(numbers));
    }
}

