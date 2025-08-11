package assignment9;

import java.io.*;
import java.util.Scanner;

public class wordsearchinfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        boolean found = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }
            reader.close();

            if (found) {
                System.out.println("Word found in file.");
            } else {
                System.out.println("Word not found in file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}

