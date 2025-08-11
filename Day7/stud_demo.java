package assignment7;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class stud_demo {
    public static void updateMarks(Student student, int newMarks) {
        student.marks = newMarks;  // Update marks
        System.out.println("Inside method: marks = " + student.marks);
    }
    public static void main(String[] args) {
        Student s = new Student("Ravi", 75);
        System.out.println("Before update: " + s.name + " has marks " + s.marks);
        updateMarks(s, 90);
        System.out.println("After update: " + s.name + " has marks " + s.marks);
    }
}
