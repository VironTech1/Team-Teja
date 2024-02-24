import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "C:/Users/RICKY/Desktop/MyFile.txt";

        try {
            int wordCount = countWords(filePath);
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countWords(String filePath) throws IOException {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                wordCount += words.length;
            }
        }

        return wordCount;
    }
}
