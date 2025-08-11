package assignment9;

import java.io.*;

public class replacewordinfile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("Java", "Python");
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Replacement done. Updated file: sample.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}