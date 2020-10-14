import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.net.URL;

public class Main{
	public static void main(String args[]) throws IOException{
		URL url = new URL("https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String linString = reader.readLine();
		while(linString != null) {
			System.out.println(linString);
			linString = reader.readLine();
		}
		System.out.println("Done");
		
	}
}
