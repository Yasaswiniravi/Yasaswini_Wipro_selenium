package Assignment6;
enum OperationSwitch {
    PLUS, MINUS, TIMES, DIVIDE;
    double eval(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}
public class Mainswitch {
    public static void main(String[] args) {
        double x = 10, y = 5;
        for (OperationSwitch op : OperationSwitch.values()) {
            System.out.println(op + ": " + op.eval(x, y));
        }
    }
}
