import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for(int i = 0;x!=0;i++){
            sum += x%10;
            x = (int)x/10;
        }
        System.out.println("Sum of the digits is : "+sum);
    }
}

