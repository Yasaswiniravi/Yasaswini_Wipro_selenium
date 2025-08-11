package assignment9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class userinputtofile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("userinput.txt");
            System.out.println("Enter text to write into userinput.txt (type 'exit' to stop):");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break; 
                }

                writer.write(input + "\n");
            }
            writer.close();
            System.out.println("Data written to userinput.txt successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        sc.close();
    }
}

