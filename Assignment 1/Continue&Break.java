import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        //Printing only odd numbers of an array and skipping the even numbers using continue.
        Label1:
            for(int i = 0;i<9;i++){
                if(arr[i] %2 == 0){
                    System.out.println("even number,continue from Label1");
                    continue Label1;
                }
                System.out.println(arr[i]);
            }
            //Searching of an element in the array, if the number is found then it will break the loop.
            System.out.print("Enter the number ");
            int x = scanner.nextInt();
            Label2:
            for(int i = 0;i<9;i++){
                if(x == arr[i]){
                    System.out.println("element found, break from Label2");
                    break Label2; // exiting the loop if the element is found.
                }
            }


    }
}

