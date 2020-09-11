package com.company;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        String x = scanner.nextLine();
        char a[] = x.toCharArray();
        String b = "";
        for(int i = a.length-1;i>=0;i--){
            b+=a[i];
        }
        if(x.equals(b)){
            System.out.println(x+" is a palindrome.");
        }
        else{
            System.out.println(x+" is not a palindrome.");
        }
    }

}

