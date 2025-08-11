package assignment9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

