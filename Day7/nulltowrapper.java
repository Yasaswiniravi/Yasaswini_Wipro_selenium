package assignment7;
public class nulltowrapper {
    public static void main(String[] args) {
        Integer num = null;

        try {
            int primitiveNum = num;  
            System.out.println("Value: " + primitiveNum);
        } catch (NullPointerException e) {
            System.out.println("Cannot convert null wrapper to primitive!");
        }
    }
}