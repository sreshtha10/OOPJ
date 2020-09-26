import java.util.Scanner;
class ReverseArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tmp,j = n;
        for(int i = 0;i<j;i++,j--){
            tmp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = tmp;

        }
        System.out.println("Reversed Array");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
