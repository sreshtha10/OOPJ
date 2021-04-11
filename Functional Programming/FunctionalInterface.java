package project0;

public class FunctionalInterface {

	public static void main(String[] args) {
			
		Greeting greeting = str -> System.out.println(str);
		greeting.print("Hello !");

	}

}


// if an interface has only one method it is called functional interface 
interface Greeting{
	public void print(String str);
}
