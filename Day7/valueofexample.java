package assignment7;
public class valueofexample {
    public static void main(String[] args) {
        int num = 100;
        String str = String.valueOf(num);
        System.out.println("String value: " + str);
        int num2 = Integer.parseInt(str);
        System.out.println("Integer value: " + num2);
    }
}