package assignment9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readstudfile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

