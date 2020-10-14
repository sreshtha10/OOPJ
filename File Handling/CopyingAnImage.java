import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main{
	public static void main(String args[]) throws IOException{
		File newFile = new File("batman.jpg");
		FileInputStream inputStream = new FileInputStream(newFile);
		// read from the input stream
		byte bytes[] = new byte[(int)newFile.length()];
		int numOfBytes = inputStream.read(bytes); // copying the data
		try { //If the file already exist
			FileOutputStream outputStream = new FileOutputStream("superman.jpg");
			outputStream.write(bytes);
		}
		catch (IOException e) {
			File f1 = new  File("superman.jpg");
			FileOutputStream outputStream = new FileOutputStream(f1);
			outputStream.write(bytes);
		}
	}
}
