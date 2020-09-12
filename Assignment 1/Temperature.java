import java.util.Scanner;
class Main {
    public static void main(String args[]) {
       Scanner scanner  =new Scanner(System.in);
       System.out.print("Enter the unit of temperature 1. Celsius 2. Fahrenheit ");
       int opt = scanner.nextInt();
       System.out.print("Enter the value ");
       float val = scanner.nextFloat();
       if(opt == 1){
           val = (val*9/5)+32.0f;
           System.out.println("Temperature: "+val+" degree Fahrenheit");
       }
       else if(opt == 2){
           val = (val-32.0f)*5/9;
           System.out.println("Temperature: "+val+" degree Celsius");
       }
       else{
           System.out.println("Choose from 1 and 2");
       }



    }
}

