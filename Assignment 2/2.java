class Sum{
    public static  void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        //Sum of the array
        int sum = 0;
        for(int i = 0;i<10;i++){
            sum += arr[i];
        }
        System.out.println("Sum of the elements of array is "+sum);
    }
}
