package Assignment6;
import java.io.*;
public class multiexceptiondemo {
    public static void main(String[] args) {
        String filename = "employee.txt"; 

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int num = Integer.parseInt(line);
            int result = 100 / num;
            System.out.println("Result: " + result);
            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {
            System.out.println("Problem reading file");
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } 
        finally {
            System.out.println("Execution completed");
        }
    }
}

