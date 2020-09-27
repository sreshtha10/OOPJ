import java.util.Scanner;

class Passenger{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of seats in the bus");
        int n = scanner.nextInt();
        String seats[][] = new String[n][2];
        int status[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter 1 if seat "+(i+1)+" is filled or zero if it is vacant.");
            status[i] = scanner.nextInt();
            if(status[i] == 0){
                continue;
            }
            else if(status[i] == 1){
                System.out.println("Enter the name of the passenger");
                scanner.nextLine();
                seats[i][0] = scanner.nextLine();
                System.out.println("Enter the destination of the passenger");
                seats[i][1] = scanner.nextLine();
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        for(int i = 0;i<n;i++){
            if(status[i] == 0){
                System.out.println("Seat "+(i+1)+" is vacant.");
            }
            else{
                System.out.println("Seat "+(i+1)+" is occupied by "+seats[i][0]+", who is going to "+seats[i][1]);
            }
        }

    }
}
