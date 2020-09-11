import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = scanner.nextInt();
        if(x%2 == 0){
            System.out.println(x+" is even.");
        }
        else{
            System.out.println(x+" is odd.");
        }
    }

}

