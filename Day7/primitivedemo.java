package assignment7;
public class primitivedemo {
    public static void changeValue(int num) {
        num = 100;
    }
    public static void main(String[] args) {
        int x = 50;
        changeValue(x);
        System.out.println("After method call, x = " + x); 
    }
}
