package Assignment3;
//8.copy all elements from one array to another 
public class Copy_array {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[5];  
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
	}

}
