import java.util.Scanner;
class FindDuplicate{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int visited[] = new int[n];
        int count;
        for(int i=0;i<n;i++){
            count = 0;
            if(visited[i] == 1){
                continue;
            }
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = 1;
                }
            }
            if(count > 1){
                System.out.println(arr[i]);
            }
        }

    }
}
