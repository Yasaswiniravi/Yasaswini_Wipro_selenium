package Assignment3;
//write a program to print an array in reverse order 
public class Reverse_array {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
	}

}
