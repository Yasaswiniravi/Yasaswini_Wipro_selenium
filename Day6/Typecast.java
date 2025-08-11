package Assignment6;

import java.util.Scanner;
public class Typecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();
        double doubleVal = intVal;
        System.out.println("Integer value: " + intVal);
        System.out.println("As double: " + doubleVal);
        System.out.print("\nEnter a double: ");
        double doubleInput = sc.nextDouble();
        int intFromDouble = (int) doubleInput;
        short shortFromInt = (short) intFromDouble;
        System.out.println("Double value: " + doubleInput);
        System.out.println("As int : " + intFromDouble);
        System.out.println("As short: " + shortFromInt);
        sc.close();
    }
}

