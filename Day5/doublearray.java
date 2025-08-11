package Assignment5;
import java.util.Scanner;
public class doublearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int size = scanner.nextInt();
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        double sum = 0;
        double max = numbers[0];
        double average;
        for (double num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        average = sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
        scanner.close();
    }
}

