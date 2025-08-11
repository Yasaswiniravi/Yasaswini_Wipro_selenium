package Assignment8;

import java.util.LinkedList;

public class clonelinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        LinkedList<Integer> clonedList = (LinkedList<Integer>) numbers.clone();

        System.out.println("Original List: " + numbers);
        System.out.println("Cloned List: " + clonedList);
    }
}

