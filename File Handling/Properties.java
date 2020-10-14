import java.io.File;
import java.io.IOException;

public class Main{
	public static void main(String args[]) {
		try {  
			// Obtaining details
			File myFile = new File("details.txt");
			if(myFile.exists()) {
				System.out.println("File Name: "+myFile.getName());
				System.out.println("Path of file: "+myFile.getAbsolutePath());
				System.out.println("Writable: "+myFile.canWrite());
				System.out.println("Readable: "+myFile.canRead());
				System.out.println("File size in bytes: "+myFile.length());
			}
			else {
				System.out.println("File doesn't exist.");
			}
			
		}
		catch (Exception  e) {
			System.out.println("Error occured");
			System.exit(1);
		}
	}
}
