package inputoutputoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


public class InputOutput {

	/*
	 * 1.Count number of words in a file 2.Search the word existence 3. count
	 * specified word existence 4. print file names from a folder 5. Serialization /
	 * De serialization - Learning
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Key board to console
		/*
		 * InputStream in = System.in;
		 * 
		 * OutputStream out = System.out;
		 * 
		 * char i = (char) in.read();
		 * 
		 * while (i != 'q') { out.write(i); out.flush(); i = (char) in.read(); }
		 */

		// Keyboard to file
		/*
		 * InputStream in = System.in;
		 * 
		 * OutputStream out = new FileOutputStream("file1.txt");
		 * 
		 * char i = (char) in.read();
		 * 
		 * while (i != 'q') { out.write(i); out.flush(); i = (char) in.read(); }
		 */

		/*
		 * //File to file InputStream in = new FileInputStream("Viron.txt");
		 * 
		 * OutputStream out = new FileOutputStream("file1.txt");
		 * 
		 * int c = in.read();
		 * 
		 * while (c != -1) { out.write((char) c); out.flush(); c = in.read(); }
		 */

		// File to console
		/*
		 * InputStream in = new FileInputStream("Viron.txt"); OutputStream out =
		 * System.out; int c = in.read(); while (c != -1) { out.write((char) c);
		 * out.flush(); c = in.read(); } //System.out.println(new
		 * File(".").getAbsolutePath());
		 */

		File f1 = new File("Viron.txt");
		System.out.println(new File(".").getAbsolutePath());

		/*
		 * f1.createNewFile(); // System.out.println(f1.exists());
		 * 
		 * FileWriter out = new FileWriter(f1); BufferedWriter bw = new
		 * BufferedWriter(out);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the content to the fie: ");
		 * 
		 * String input = sc.nextLine();
		 * 
		 * bw.write(input);
		 */

		Reader read = new FileReader(f1);
		BufferedReader br = new BufferedReader(read);

		// System.out.println("File Content");
		String line;
		int count = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to search in: " + f1.getName());
		String word = sc.next();
		while ((line = br.readLine()) != null) {
			// System.out.println(line);
			if (line.length() != 0) {
				String[] array = line.split("\\s+");
				for (String i : array) {
					// System.out.println(i);
					if (word.equalsIgnoreCase(i))
						c++;
					count++;
				}
			}
		}
		System.out.println("No of words: " + count);
		System.out.println(c > 0 ? "The word " + word + " present " + c + " times in the file."
				: "The word is not present in the file");

		
		File directory = new File("C:\\Users\\GopiChand Velaga\\eclipse-workspace\\Sample\\src\\.");
		
		File[] files = directory.listFiles();

        if (files != null) {
            int fileCount = files.length;
            System.out.println("Number of files in the directory: " + fileCount);

            System.out.println("File names in the directory:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("The directory is empty.");
        }
		

	}

}
