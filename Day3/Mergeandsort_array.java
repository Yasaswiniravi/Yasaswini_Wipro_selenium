package Assignment3;
//13. merge two arrays and sort them 
import java.util.Arrays;
public class Mergeandsort_array {

	public static void main(String[] args) {
		int[] arr1 = {5, 1, 9};
        int[] arr2 = {8, 3, 2};
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        Arrays.sort(merged);
        System.out.println("Merged and sorted array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
		
	}

}
