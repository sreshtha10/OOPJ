class Student{
	String name;
	long phoneNo;
	int regNo;
	public Student(String name,long phoneNo, int regNo) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.regNo = regNo;
	}
}
class Main{
	public static void main(String args[]) {
		
		Student student1 = new Student("Sreshtha",9305191780L,199301229);
	}
}
