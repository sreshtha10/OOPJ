import java.util.Scanner;
class Student{
	// Inner Class
	class Courses{
		String[] courseName;   //Name of the course
		int[] courseCredits; // Credit weightage of a course
		double[] coursePoints; // Points scored by student in the course
		Courses(int size){
			this.courseCredits = new int[size];
			this.courseName = new String[size];
			this.coursePoints = new double[size];
		}
		
		public void setCourseDetails() {
			for(int i = 0;i<courseName.length;i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Course Name");
				courseName[i] = sc.nextLine();
				System.out.println("Enter Course Credits");
				courseCredits[i] = sc.nextInt();
				System.out.println("Enter your points");
				coursePoints[i] = sc.nextDouble();
			}
			return;
			
		}
		public void getCourseDetails() {
			for (int i = 0; i < courseCredits.length; i++) {
				System.out.println("Course Name : "+this.courseName[i]+" Course Credits: "+this.courseCredits[i]+" Points Scored: "+this.coursePoints[i]);
			}
		}
	}
	
	String name;
	long reg;
	String address;
	double cgpa;
	Courses course;
	public Student(String name,long reg,String address,int numberofCourses) {
		this.name= name;
		this.reg = reg;
		this.address = address;
		this.course = new Courses(numberofCourses);
	}
	
	// CGPA = summation of ( course credit * course points)/ total credits
	public double showCGPA() {
		double total= 0, totalCredits = 0;
		for(int i=0;i<course.courseCredits.length;i++) {
			total += course.courseCredits[i]*course.coursePoints[i]; 
			totalCredits += course.courseCredits[i];
		}
		return total/totalCredits;
	}
	
	public void showDetails() {
		System.out.println("Name: "+this.name+" Registration No.: "+this.reg+" Address: "+this.address);
		this.course.getCourseDetails();
		return;
	}
}
class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Student's registration number: ");
		long reg = sc.nextLong();
		System.out.print("Enter Student Address: ");
		String address = sc.next();
		System.out.print("Enter no of courses: ");
		int num = sc.nextInt();
		Student student = new Student(name,reg,address,num);
		boolean run = true;
		System.out.println("Choose from the following");
		System.out.println("1. Enter details of Courses");
		System.out.println("2. Show Student details");
		System.out.println("3. Calculate CGPA");
		System.out.println("4. Exit");
		while(run) {
			int opt = sc.nextInt();
			switch(opt) {
			case 1:{
				student.course.setCourseDetails();
				System.out.println("*************");
				break;
			}
			case 2:{
				student.showDetails();
				System.out.println("*************");
				break;
			}
			case 3:{
				System.out.println("CGPA: "+student.showCGPA());
				System.out.println("*************");
				break;
			}
			case 4:{
				run = false;
				break;
			}
			default:
				System.out.println("Invalid option");
			}
		}
	}
}
