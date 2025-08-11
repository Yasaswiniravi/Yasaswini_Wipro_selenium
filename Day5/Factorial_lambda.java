package Assignment5;

import java.util.Scanner;
interface Factorial {
    int calculate(int n);
}
public class Factorial_lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        Factorial fact = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        int output = fact.calculate(num);
        System.out.println("Factorial of " + num + " is: " + output);
        scanner.close();
    }
}
