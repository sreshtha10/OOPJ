package com.company;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = scanner.nextInt();
        int y = x;
        int sum = 0;
        int len = Integer.toString(x).length();
        for(int i=0;y!=0;i++){
            sum += Math.pow(y%10,len);
            y = (int)y/10;
        }
        if(sum == x){
            System.out.println(x+" is an armstrong number.");
        }
        else{
            System.out.println(x+" is not an armstrong number.");
        }
    }

}

