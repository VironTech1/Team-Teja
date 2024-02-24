import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {
    public static void main(String[] args) {
        String filePath = "C:/Users/RICKY/Desktop/MyFile.txt"; 
        String wordToSearch = "Hello"; 

        try {
            boolean exists = searchWord(filePath, wordToSearch);
            if (exists) {
                System.out.println("The word \"" + wordToSearch + "\" exists in the file.");
            } else {
                System.out.println("The word \"" + wordToSearch + "\" does not exist in the file.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean searchWord(String filePath, String word) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
