import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        if(n==1){
            System.out.println("The 1 term is "+a);
            return;
        }
        else if(n == 2){
            System.out.println("The 2 term is "+b);
            return;
        }
        int c = 0;
        for(int i = 2;i<n;i++){
            c = a+b;
            a = b;
            b = c;

        }
        System.out.println("The "+n+" term is: "+c);
        return;

    }
}
