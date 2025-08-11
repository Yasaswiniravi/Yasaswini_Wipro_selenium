package Assignment8;

import java.util.LinkedList;
public class addfirstlast {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);   
        numbers.addLast(40);   

        System.out.println("Updated LinkedList: " + numbers);
    }
}

