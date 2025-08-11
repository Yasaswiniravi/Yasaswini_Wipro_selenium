package Assignment8;

import java.util.ArrayList;
import java.util.Collections;
public class reverselist {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        Collections.reverse(chars);
        System.out.println("Reversed list: " + chars);
    }
}
