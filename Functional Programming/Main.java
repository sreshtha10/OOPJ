
class Main{
	public static void main(String args[]) {
		
		// creating an action
		MyLambda myLambdaFunction = ()-> System.out.println("Hello World");
		// lambda for add
		Add addFunction = (int a,int b) -> a+b;
		myLambdaFunction.perform();;
		System.out.println(addFunction.add(1, 2));
	}
	
	

	
}


interface MyLambda{
	void perform();
}
interface Add{
	int add(int x,int y);
}


