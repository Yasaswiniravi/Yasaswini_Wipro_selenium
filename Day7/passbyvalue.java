package assignment7;

public class passbyvalue {
    public static void changeValue(int num) {
        num = 100;  
        System.out.println("Inside method, num = " + num);
    }
    public static void main(String[] args) {
        int original = 50;
        System.out.println("Before method call, original = " + original);
        changeValue(original);
        System.out.println("After method call, original = " + original);
    }
}
