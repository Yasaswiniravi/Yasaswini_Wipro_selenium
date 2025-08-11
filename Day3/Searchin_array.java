package Assignment3;
//5.write a program to search for a number entered by the user in an array 
import java.util.Scanner;
public class Searchin_array {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                System.out.println(search + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println(search + " not found in the array.");
        }
        sc.close();
    }

}
