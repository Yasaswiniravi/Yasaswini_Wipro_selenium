package Assignment3;
//Write a program to remove all white Spaces from string 
public class remove_whitespaces {

	public static void main(String[] args) {
		String input = "Java is  easy to learn";
        String result = input.replaceAll(" ", "");
        System.out.println("Original: " + input);
        System.out.println("Without spaces: " + result);
	}

}
