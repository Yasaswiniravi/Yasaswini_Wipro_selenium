package Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class removefruit {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name to remove: ");
        String fruit = sc.nextLine();
        if (fruits.remove(fruit)) {
            System.out.println(fruit + " removed successfully.");
        } else {
            System.out.println(fruit + " not found in the list.");
        }
        System.out.println("Updated list: " + fruits);
        sc.close();
    }
}
