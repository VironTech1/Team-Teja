package CoreJava;
import java.io.File;

public class FileDisplay {
    public static void main(String[] args) {
	
		File folder = new File("C:\\Users\\BOREDDY MANASA\\Desktop\\Viron");
		File[] NoofFiles = folder.listFiles();
		

		for (int i = 0; i < NoofFiles.length; i++) {
		  if (NoofFiles[i].isFile()) {
		    System.out.println(NoofFiles[i].getName());
		  } 
	}
	}

    
}
