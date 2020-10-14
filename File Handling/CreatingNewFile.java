import java.io.File;

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
			
		}
		catch (Exception e) {
			System.out.println("Error occured");
			System.exit(1);
		}
	}
}
