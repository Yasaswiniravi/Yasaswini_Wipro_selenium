package Assignment6;
enum OperationOverride {
    PLUS {
        double eval(double a, double b) { 
        	return a + b; 
        	}
    },
    MINUS {
        double eval(double a, double b) { 
        	return a - b; 
        	}
    },
    TIMES {
        double eval(double a, double b) { 
        	return a * b; 
        	}
    },
    DIVIDE {
        double eval(double a, double b) { 
        	return a / b; 
        	}
    };
    abstract double eval(double a, double b);
}
public class mainswitch2 {
    public static void main(String[] args) {
        double x = 10, y = 5;
        for (OperationOverride op : OperationOverride.values()) {
            System.out.println(op + ": " + op.eval(x, y));
        }
    }
}
