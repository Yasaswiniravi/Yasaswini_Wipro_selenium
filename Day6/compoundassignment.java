package Assignment6;

public class compoundassignment {
    public static void main(String[] args) {
        try {
            int num = 123;
            String str = String.valueOf(num);
            System.out.println("String value: " + str);

            int parsed = Integer.parseInt(str);
            System.out.println("Parsed integer: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
        int x = 5;
        x += 4.5;
        System.out.println("Value of x after x += 4.5: " + x);
    }
}
