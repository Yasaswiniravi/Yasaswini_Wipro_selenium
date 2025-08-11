package Assignment6;
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
public class oldchecker {
    public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        } else {
            System.out.println(n + " is even. No exception thrown.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11};
        for (int num : numbers) {
            try {
                checkOdd(num);
            } catch (OddNumberException e) {
                System.out.println("Caught Exception → " + e.getMessage());
            }
        }
    }
}

