import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        for(int i = 1;i<=y;i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}

