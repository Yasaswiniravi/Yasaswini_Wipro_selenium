package Assignment3;
//11. find out frequency of each element 
public class Frequencycount_array {

	public static void main(String[] args) {
		int[] arr = {2, 3, 2, 4, 3, 5, 2};
        int n = arr.length;
        boolean[] visited = new boolean[n];  
        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;  
            }
            int count = 1;  
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;  
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
	

}
