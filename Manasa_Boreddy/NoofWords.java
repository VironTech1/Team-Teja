package CoreJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NoofWords {
    public static void main(String[] args) throws FileNotFoundException {
		int Count=0;
		File f=new File("C:\\Users\\BOREDDY MANASA\\Desktop\\Greeting.txt");
		FileInputStream fis = new FileInputStream(f);
	      byte[] word = new byte[(int)f.length()];
	     try {
			fis.read(word);
		} catch (IOException e) {
			e.printStackTrace();
		}
	      String s = new String(word);
	      String [] Numofword = s.split(" ");
	      System.out.println("Number of words in the given file are " +Numofword.length);

	}

}

    

