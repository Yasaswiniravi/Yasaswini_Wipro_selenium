package Assignment6;

import java.util.Scanner;
enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enumexamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = sc.nextLine().toUpperCase();
        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println("Position: " + day.ordinal());
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's a weekend!");
                    break;
                default:
                    System.out.println("It's a weekday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day name.");
        }
        sc.close();
    }
}
