package assignment9;

import java.io.FileWriter;
import java.io.IOException;

public class appendstudfile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Sophia\n");

            writer.close();
            System.out.println("New student name appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending.");
            e.printStackTrace();
        }
    }
}

