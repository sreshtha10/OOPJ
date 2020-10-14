import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Main{
	public static void main(String args[]) {
		try {
			File myFile = new File("details.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created: "+myFile.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
			FileWriter myWriter = new FileWriter(myFile);
			myWriter.write("Hello World");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch (IOException e) {
			System.out.println("Error occured");
			System.exit(1);
		}
	}
}
