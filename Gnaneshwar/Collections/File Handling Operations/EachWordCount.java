import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EachWordCount {
    public static void main(String[] args) {
        String filePath = "C:/Users/RICKY/Desktop/MyFile.txt"; 
        String wordToCount = "World";

        try {
            int count = countWord(filePath, wordToCount);
            System.out.println("The word \"" + wordToCount + "\" appears " + count + " times in the file.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countWord(String filePath, String word) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equals(word)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
              
