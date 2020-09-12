import java.util.Scanner;
class Main {
    public static void main(String args[]) {
       Scanner scanner  =new Scanner(System.in);
       System.out.print("Enter your marks ");
       int marks = scanner.nextInt();
       String grade = (marks >90)?"A+":(marks >80)?"A":(marks > 70)?"B":(marks >60)?"C":(marks > 50)?"D":(marks>40)?"E":"F";
       System.out.println("Grade "+grade);
    }
}

