package Assignment3;
//Check if a string is Palindrome 
public class Palindrome {

	public static void main(String[] args) {
		String input = "madam";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is Not a Palindrome");
        }
	}

}
