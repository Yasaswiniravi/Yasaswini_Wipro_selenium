package Assignment5;

interface Polygon {
    double getArea();
    default double getPerimeter(int... sides) {
        double sum = 0;
        for (int s : sides) 
        	sum += s;
        return sum;
    }
    static String shapeInfo() {
        return "A polygon is a closed shape with straight sides.";
    }
}
class Rect implements Polygon {
    double length, width;
    Rect(double l, double w) { 
    	length = l;
    	width = w; 
    	}
    public double getArea() { 
    	return length * width; 
    	}
}
class Triangle implements Polygon {
    double base, height;
    Triangle(double b, double h) { 
    	base = b;
    	height = h; 
    	}
    public double getArea() { 
    	return 0.5 * base * height; 
    	}
}
public class Mainpolygon {
    public static void main(String[] args) {
        Rect rect = new Rect(4, 5);
        Triangle tri = new Triangle(3, 6);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter(4, 5, 4, 5));
        System.out.println("Triangle area: " + tri.getArea());
        System.out.println("Triangle perimeter: " + tri.getPerimeter(3, 4, 5));
        System.out.println(Polygon.shapeInfo());
    }
}
   