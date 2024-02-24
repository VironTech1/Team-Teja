package fileex;

import java.io.File;

public class printoffolder {
    public static void main(String[] args) {
        String folderPath = "/Users/shanmukavamshiburugu/downloads";

        File folder = new File(folderPath);

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null && files.length > 0) {
                System.out.println("Files in the folder:");

                for (File file : files) {
                    if (file.isFile()) { 
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("No files found in the folder.");
            }
        } else {
            System.out.println("Specified path is not a directory.");
        }
    }
}

