package Assignment3;
//Create one employee class and in that class create instance variable, local variable and static variable.(done) 
public class Emp_1 {
    // Instance variables
    int empId;
    String empName;

    // Static variable
    static String companyName = "Tech_stack";

    // Constructor
    public Emp_1(int id, String name) {
        empId = id;
        empName = name;
    }
    public void displayDetails() {
        // Local variable
        String message = "Employee Details:";

        System.out.println(message);
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Emp_1 emp1 = new Emp_1(101, "Alice");
        emp1.displayDetails();

        System.out.println();
        Emp_1 emp2 = new Emp_1(102, "Bob");
        emp2.displayDetails();
    }
}
