package assignment7;
class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}
public class callbyreference {
    public static void changeWithWrapper(IntWrapper num) {
        num.value = 100;
        System.out.println("Inside changeWithWrapper: value = " + num.value);
    }
    public static void changeWithArray(int[] arr) {
        arr[0] = 200;
        System.out.println("Inside changeWithArray: arr[0] = " + arr[0]);
    }
    public static void main(String[] args) {
        IntWrapper myNum = new IntWrapper(50);
        int[] numbers = {50};
        System.out.println("Before method calls:");
        System.out.println("Wrapper value = " + myNum.value);
        System.out.println("Array value = " + numbers[0]);
        changeWithWrapper(myNum);
        changeWithArray(numbers);
        System.out.println("After method calls:");
        System.out.println("Wrapper value = " + myNum.value);
        System.out.println("Array value = " + numbers[0]);
    }
}

