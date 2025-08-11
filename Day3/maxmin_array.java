package Assignment3;
// find maximum and minimum elements from an array.
public class maxmin_array {

	public static void main(String[] args) {
		int[] numbers = {15, 2, 20, 8, 10, 98};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

	}

}
