package Assignment6;
import java.util.*;
enum Shape {
    CIRCLE {
        double area(double... params) {
            double radius = params[0];
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        double area(double... params) {
            double side = params[0];
            return side * side;
        }
    },
    RECTANGLE {
        double area(double... params) {
            double length = params[0];
            double width = params[1];
            return length * width;
        }
    },
    TRIANGLE {
        double area(double... params) {
            double base = params[0];
            double height = params[1];
            return 0.5 * base * height;
        }
    };
    abstract double area(double... params);
}
public class shapeareacalculator {
    public static void main(String[] args) {
        double radius = 5;
        double side = 4;
        double length = 6, width = 3;
        double base = 8, height = 4;
        for (Shape shape : Shape.values()) {
            switch (shape) {
                case CIRCLE:
                    System.out.println("CIRCLE area: " + shape.area(radius));
                    break;
                case SQUARE:
                    System.out.println("SQUARE area: " + shape.area(side));
                    break;
                case RECTANGLE:
                    System.out.println("RECTANGLE area: " + shape.area(length, width));
                    break;
                case TRIANGLE:
                    System.out.println("TRIANGLE area: " + shape.area(base, height));
                    break;
            }
        }
    }
}