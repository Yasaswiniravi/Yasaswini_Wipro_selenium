package Assignment8;

import java.util.LinkedList;
import java.util.ListIterator;
public class listiterator1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");
        ListIterator<String> it = cities.listIterator();
        System.out.println("Forward direction:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Reverse direction:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

