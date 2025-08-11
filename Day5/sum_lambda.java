package Assignment5;
interface Addable {
 int add(int a, int b);
}
public class sum_lambda {
 public static void main(String[] args) {
     Addable sum = (a, b) -> a + b;
     int result = sum.add(10, 20);
     System.out.println("Sum: " + result);
 }
}