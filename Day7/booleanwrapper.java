package assignment7;

public class booleanwrapper {
    public static void main(String[] args) {
        Boolean boolObj1 = Boolean.valueOf(true);   
        Boolean boolObj2 = Boolean.FALSE;           
        System.out.println("boolObj1 = " + boolObj1);
        System.out.println("boolObj2 = " + boolObj2);
        boolean primBool = boolObj1.booleanValue();
        System.out.println("Primitive boolean = " + primBool);
    }
}