class Address{
    int x;
    Address(int x){
        this.x = x;
    }
}
public class Main
{
	public static void main(String[] args) {
		Address arr[] = new Address[4];
		for(int i=0;i<4;i++){
		    arr[i] = new Address(1);
		}
		
	}
}
