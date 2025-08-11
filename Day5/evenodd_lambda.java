package Assignment5;

import java.util.Scanner;
interface CheckNumber {
    void test(int n);
}
public class evenodd_lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        CheckNumber check = (n) -> {
            if (n % 2 == 0)
                System.out.println(n + " is Even.");
            else
                System.out.println(n + " is Odd.");
        };
        check.test(number);
        scanner.close();
    }
}