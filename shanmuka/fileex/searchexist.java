

//Search the word existence

package fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchexist {
    public static void main(String[] args) {
        String wordToSearch = "Syntax"; 
        boolean wordExists = false; 
        try {
            File file = new File("/Users/shanmukavamshiburugu/Downloads/Javalearning.rtf");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equalsIgnoreCase(wordToSearch)) { 
                    wordExists = true; 
                    break; 
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        if (wordExists) {
            System.out.println("The word '" + wordToSearch + "' exists in the file.");
        } else {
            System.out.println("The word '" + wordToSearch + "' does not exist in the file.");
        }
    }
}
