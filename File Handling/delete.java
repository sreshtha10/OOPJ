import java.io.File;

public class Main{
	public static void main(String args[]) {
		try {  
			File myFile = new File("details.txt");
			if(myFile.exists()) {
				if(myFile.delete()) {
					System.out.println("File Deleted: "+myFile.getName());
				}
				else {
					System.out.println("Failed to delete the file");
				}
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
