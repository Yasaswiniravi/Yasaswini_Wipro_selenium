package Assignment8;

import java.util.Vector;
public class vectortasks {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("Contains Bob? " + names.contains("Bob"));
        names.set(1, "Brian");
        System.out.println("After replacement: " + names);
        names.clear();
        System.out.println("After clear: " + names);
        Vector<String> v1 = new Vector<>();
        v1.add("A");
        v1.add("B");
        Vector<String> v2 = new Vector<>();
        v2.addAll(v1);
        System.out.println("v1 equals v2? " + v1.equals(v2));
        Vector<Integer> nums = new Vector<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println("Sum = " + sumVector(nums));
    }
    public static int sumVector(Vector<Integer> v) {
        int sum = 0;
        for (int n : v) sum += n;
        return sum;
    }
}
