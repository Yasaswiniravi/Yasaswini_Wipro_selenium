package Assignment5;
/*2. Rectangle Enforced Positive Dimensions
Encapsulate validation and provide derived calculations.
•	Build a Rectangle class with private width and height.
•	Constructor and setters should reject or correct non-positive values (e.g., use default or throw an exception).
•	Provide getArea() and getPerimeter() methods.
•	Include displayDetails() method. */
public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1; 
            System.out.println("Invalid width. Setting default 1.");
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1; 
            System.out.println("Invalid height. Setting default 1.");
        }
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive.");
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void displayDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, -3); 
        rect1.displayDetails();
        System.out.println();
        rect1.setHeight(4);  
        rect1.setWidth(-2);  
        rect1.displayDetails();
    }
}
