import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class ExcercisesRunner {

    public static void main(String[] args) throws IOException {
    	
    	Scanner scanner = new Scanner(System.in);
    	String filepath = "./resources/data.txt";
    	FileReader file = new FileReader(filepath);
    	BufferedReader br = new BufferedReader(file);
    	
    	
    	String line;
    	int count = 0;
    	
    	while((line = br.readLine())!= null) {
    		String words[] = line.split(" ");
    		count += words.length;
    		
    	}
    	System.out.println("total words are "+ count);
    	
    	
//Search the word existence

    	
    	
    	boolean wordPresent = false;
    	file = new FileReader(filepath);
    	 br = new BufferedReader(file);
    	 System.out.println("enter anything to chech it is existing or not");
    	 String wordFind = scanner.nextLine();   
    	 
    	while((line = br.readLine())!= null) {
    		if(line.contains(String.valueOf(wordFind))) {
    			wordPresent = true;
    			break;
    		}
    	}
    	
    	if(wordPresent) {
    		System.out.println("the word exits in the given file");
    	}
    	else {
    		System.out.println("the word does not exits in the given file");
    	}
    	
    	
    	
    	//⁠ ⁠count specified word existence
    	
    	
    	file = new FileReader(filepath);
    	br = new BufferedReader(file);
    	System.out.println("enter anything to count the existing word");
    	String wordFind1 = scanner.nextLine(); 
    	int count1 =0;
    	
    	while((line = br.readLine()) != null) {
    		
    		if(line.contains(wordFind1)){
    			count1++;
    		}
    	}
    	
    	System.out.println("count of existing word is "+ count1);
    	
    	
    
    	// Specify the directory path
    
    	Path currentDirectory = Paths.get(".");
		
		
		Files.list(currentDirectory).forEach(System.out::println);

    }
}
