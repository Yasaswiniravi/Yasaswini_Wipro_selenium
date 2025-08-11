package Assignment5;
import java.util.Scanner;
interface StringConverter {
    String convert(String input);
}
public class Stringcaseconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringConverter toUpper = s -> s.toUpperCase();
        StringConverter toLower = s -> s.toLowerCase();
        System.out.println("Uppercase: " + toUpper.convert(input));
        System.out.println("Lowercase: " + toLower.convert(input));

        scanner.close();
    }
}