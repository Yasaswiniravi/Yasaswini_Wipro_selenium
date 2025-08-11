package Assignment3;
//Write a program to count even and odd numbers from an array
public class evenodd_array {

	public static void main(String[] args) {
		int[] numbers = {10, 17, 22, 31, 44, 55};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
	}

}
