package Assignment6;
import java.io.*;
public class filereaddemo {
    public static void readFile(String filename) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String firstLine = br.readLine();
        System.out.println("First line: " + firstLine);
        br.close();
    }
    public static void main(String[] args) {
        String filename = "test.txt"; 
        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done.");
        }
    }
}