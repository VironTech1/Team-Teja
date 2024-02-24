
package fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class countofsearch {
    public static void main(String[] args) {
        String wordToCount = "Java"; 
        int wordCount = 0; 
        try {
            File file = new File("/Users/shanmukavamshiburugu/Downloads/Javalearning.rtf");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next(); 
                if (word.equalsIgnoreCase(wordToCount)) { 
                    wordCount++; 
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        System.out.println("Number of occurrences of the word '" + wordToCount + "' in the file: " + wordCount);
    }
}
