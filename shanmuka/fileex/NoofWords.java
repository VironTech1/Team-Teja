package fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoofWords {
    public static void main(String[] args) {
        int wordCount = 0;
        try {
            File file = new File("/Users/shanmukavamshiburugu/Downloads/Javalearning.rtf");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        System.out.println("Number of words in the given file are: " + wordCount);
    }
}
