package Assignment5;
public class Grade_validation {
    private String name;
    private int rollNumber;
    private int marks;
    public Grade_validation(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0; 
        }
    }
    // Getter methods
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getMarks() {
        return marks;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public void inputMarks(int newMarks) {
        if (newMarks > this.marks && newMarks <= 100) {
            this.marks = newMarks;
        } else {
            System.out.println("Invalid mark update. Either less than existing or out of range.");
        }
    }
    public static void main(String[] args) {
    	Grade_validation s1 = new Grade_validation("Ravi", 101, 85);
        s1.displayDetails();
        s1.inputMarks(90);  
        s1.inputMarks(50);  
        System.out.println("After attempted updates:");
        s1.displayDetails();
    }
}
