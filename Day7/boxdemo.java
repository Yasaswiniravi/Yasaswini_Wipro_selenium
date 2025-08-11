package assignment7;
class Box {
    int length;
    Box(int length) {
        this.length = length;
    }
}
public class boxdemo {
    public static void changeLength(Box box) {
        box.length = 100;  
        System.out.println("Inside method, length = " + box.length);
    }
    public static void main(String[] args) {
        Box myBox = new Box(50);
        System.out.println("Before method call, length = " + myBox.length);
        changeLength(myBox);
        System.out.println("After method call, length = " + myBox.length);
    }
}
