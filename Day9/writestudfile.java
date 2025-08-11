package assignment9;

import java.io.FileWriter;  
import java.io.IOException;  

public class writestudfile {  
    public static void main(String[] args) {  
        try {  
            FileWriter writer = new FileWriter("student.txt");  

            writer.write("John\n");  
            writer.write("Alice\n");  
            writer.write("Bob\n");  
            writer.write("Emma\n");  
            writer.write("David\n");  

            writer.close();  

            System.out.println("student.txt created and data written successfully.");  
        } catch (IOException e) {  
            System.out.println("An error occurred.");  
            e.printStackTrace();  
        }  
    }  
}

