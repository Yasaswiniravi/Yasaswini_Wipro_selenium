package assignment9;

import java.io.*;
class Studentj implements Serializable {
 int id;
 String name;
 double marks;

 Studentj(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}
public class serializestudent {
 public static void main(String[] args) {
     Studentj s1 = new Studentj(101, "John", 85.5);

     try {
         FileOutputStream fileOut = new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(s1);
         out.close();
         fileOut.close();
         System.out.println("Student object serialized and saved in student.ser");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

