import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		try {  
			// Creating File
			File myFile = new File("details.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created: "+myFile.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
			// Writing File
			FileWriter myWriter = new FileWriter(myFile);
			myWriter.write("Hello World");
			myWriter.write("\n");
			myWriter.write("Hello Java");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			
			//Reading File
			Scanner scanner = new Scanner(myFile);
			while(scanner.hasNext()) {
				String dataString = scanner.nextLine();
				System.out.println(dataString);
			}
			
		}
		catch (IOException  e) {
			System.out.println("Error occured");
			System.exit(1);
		}
	}
}
