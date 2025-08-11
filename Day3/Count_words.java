package Assignment3;
//count words in a sentence
public class Count_words {

	public static void main(String[] args) {
		String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);
	}

}
