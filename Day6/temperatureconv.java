package Assignment6;
import java.util.Scanner;
public class temperatureconv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        int fahrenheitInt = (int) fahrenheit;
        System.out.println("Fahrenheit (precise): " + fahrenheit);
        System.out.println("Fahrenheit (truncated): " + fahrenheitInt);
        sc.close();
    }
}

