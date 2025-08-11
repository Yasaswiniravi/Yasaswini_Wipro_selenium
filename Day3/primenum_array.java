package Assignment3;
//10.print only prime numbers from array 
public class primenum_array {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 7, 10, 13, 18, 19};
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

	}

}
