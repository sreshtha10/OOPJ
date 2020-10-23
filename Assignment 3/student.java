import java.util.*;
class Student{
	private String name;
	private int[] marks;
	public Student() {
		
	}
	Student(String name, int[] marks){
		this.name = name;
		this.marks = marks;
	}
	public void displayName() {
		System.out.println("Name: "+this.name);
	}
	public double percentage() {
		int sum = 0;
		for(int i = 0;i < this.marks.length;i++) {
			sum += this.marks[i];
		}
		return (double)sum/6;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks[]) {
		this.marks = marks;
	}
	public String getName() {
		return this.name;
	}
	public int[] getMarks() {
		return this.marks;
	}
}
class Main{ 
	public static void main(String args[]) {
		int[] marks = {86,77,99,56,22,99};
		Student student = new Student("Sreshtha",marks);
		student.displayName();
		System.out.println("Percentage: "+student.percentage());
		student.setName("Sreshtha Mehrotra");
		marks[4] = 99;
		student.setMarks(marks);
		System.out.println("Name: "+student.getName());
		System.out.println("Marks: "+Arrays.toString(student.getMarks()));
		System.out.println("Percentage: "+student.percentage());
		
	}
}
