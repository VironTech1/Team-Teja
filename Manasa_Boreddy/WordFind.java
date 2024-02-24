package CoreJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordFind {
    public static void main(String[] args) throws FileNotFoundException {
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
                System.out.println("given word exists in the file ");
                break;
            }
            else if(i==Numofword.length-1)
                System.out.println("Word not found");
         }

	}

}


