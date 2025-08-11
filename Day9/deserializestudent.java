package assignment9;

import java.io.*;

//Same Student class used in serialization
class Studenta implements Serializable {
 int id;
 String name;
 double marks;

 Studenta(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}

public class deserializestudent {
 public static void main(String[] args) {
     try {
         FileInputStream fileIn = new FileInputStream("employeee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);

         Studenta s = (Studenta) in.readObject();

         in.close();
         fileIn.close();

         System.out.println("ID: " + s.id);
         System.out.println("Name: " + s.name);
         System.out.println("Marks: " + s.marks);

     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}

