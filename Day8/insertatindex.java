package Assignment8;

import java.util.LinkedList;

public class insertatindex {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Before Insertion: " + names);
        names.add(2, "David"); 
        System.out.println("After Insertion: " + names);
    }
}
