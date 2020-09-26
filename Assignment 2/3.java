import java.util.Scanner;

class ArraySum{
    public int[] sum(int arr1[],int arr2[],int n){
        int[] arr3 = new int[n];
        for(int i = 0;i<n;i++){
            arr3[i] = arr1[i]+arr2[i];
        }
        return arr3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();
        System.out.print("Enter the first array: ");
        int arr1[] = new int[n];
        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second array: ");
        int arr2[] = new int[n];
        for(int i = 0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Elements of third array are: ");
        int arr3[] = new ArraySum().sum(arr1,arr2,n);
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        sc.close();
    }
}
