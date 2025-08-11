package Assignment8;

import java.util.ArrayList;
public class updateelement {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("History");
        System.out.println("Before update: " + subjects);
        int index = subjects.indexOf("Math");
        if (index != -1) {
            subjects.set(index, "Statistics");
        }
        System.out.println("After update: " + subjects);
    }
}

