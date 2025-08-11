package Assignment8;

import java.util.Vector;
import java.util.Enumeration;
public class vectorexamp {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2, 25);
        numbers.remove(1);
        Enumeration<Integer> e = numbers.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

