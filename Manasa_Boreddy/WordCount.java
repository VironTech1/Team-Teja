package CoreJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
		Scanner scan = new Scanner(System.in);
        String found;
		File f=new File("C:\\Users\\BOREDDY MANASA\\Desktop\\Greeting.txt");
        System.out.println("Enter the word to find");
        found = scan.nextLine();
		FileInputStream fis = new FileInputStream(f);
	      byte[] word = new byte[(int)f.length()];
	     try {
			fis.read(word);
		} catch (IOException e) {
			e.printStackTrace();
		}
	      String s = new String(word);
	      String [] Numofword = s.split(" ");
          for (int i=0; i<Numofword.length; i++) {
            if(Numofword[i].equals(found))
            {
                count++;
            }
         }
         System.out.println("Number of times "+found+" appeared in the file is " +count);

	}

}



