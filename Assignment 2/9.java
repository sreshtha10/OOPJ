import java.util.Scanner;
class Search{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = s.nextInt();
        for(int i= 0,pos = 0;i<n;i++,pos++){
            if(arr[i] == x){
                System.out.println("Element found at index "+pos);
                return;
            }
        }
        System.out.println("Element not found");
        s.close();
    }
}
