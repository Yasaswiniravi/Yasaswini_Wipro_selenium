package assignment9;

import java.util.*;
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}
public class sortstudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ravi", 85.5));
        students.add(new Student(1, "Priya", 90.0));
        students.add(new Student(2, "Amit", 78.0));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

