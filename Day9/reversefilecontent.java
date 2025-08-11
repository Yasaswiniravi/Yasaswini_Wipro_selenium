package assignment9;

import java.io.*;
import java.util.*;
public class reversefilecontent {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader r = new BufferedReader(new FileReader("userinput.txt"));
            String line;
            while ((line = r.readLine()) != null) lines.add(line);
            r.close();
            Collections.reverse(lines);
            BufferedWriter w = new BufferedWriter(new FileWriter("reversed.txt"));
            for (String l : lines) {
                w.write(l);
                w.newLine();
            }
            w.close();
            System.out.println("File reversed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

