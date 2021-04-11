package project0;
//Sort list by last name
import java.util.*;

class Person{
	private String firstName;
	private String lastName;
	private int age;
	Person(String firstName,String lastName,int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "Person [ firstName = "+ this.firstName+" , lastName = "+this.lastName+" , age ="+this.age+" ]";
	}
	
	
}




class UsingLambdaWithComparator{
	public static void main(String args[]) {
		List<Person> list = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",60),
				new Person("Thomas","Carlytle",60),
				new Person("Charollete","Bronte",60),
				new Person("Matthew","Murdock",60)
				);
		
		Comparator<Person> sort = (a,b) -> a.getFirstName().compareTo(b.getFirstName());
		
		Collections.sort(list,sort);
		System.out.println(list);
		
		
		
	}	
}


