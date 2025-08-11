package assignment7;

public class primitivepass {
    public static void changeValues(int a, double b, boolean c) {
        a = 100;
        b = 20.5;
        c = false;
        System.out.println("Inside method: a = " + a + ", b = " + b + ", c = " + c);
    }
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        boolean z = true;
        System.out.println("Before method call: x = " + x + ", y = " + y + ", z = " + z);
        changeValues(x, y, z);
        System.out.println("After method call: x = " + x + ", y = " + y + ", z = " + z);
    }
}
