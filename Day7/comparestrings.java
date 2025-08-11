package assignment7;
public class comparestrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        if (str1 == str2) {
            System.out.println("str1 == str2 : They are the same object");
        } else {
            System.out.println("str1 == str2 : They are different objects");
        }
        if (str1 == str3) {
            System.out.println("str1 == str3 : They are the same object");
        } else {
            System.out.println("str1 == str3 : They are different objects");
        }
        if (str1.equals(str3)) {
            System.out.println("str1.equals(str3) : Their contents are the same");
        } else {
            System.out.println("str1.equals(str3) : Their contents are different");
        }
    }
}

