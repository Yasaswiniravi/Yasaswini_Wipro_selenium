package Assignment5;
interface SumCalculator {
 int sum(int a, int b);
}
public class Calc_lambda {
 public static void main(String[] args) {
     SumCalculator calculator = (a, b) -> a + b;
     int result = calculator.sum(15, 25);
     System.out.println("Sum: " + result);
 }
}