package com.company;
import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x;
        String odd = "",even ="";
        x = scanner.nextInt();
        int len = Integer.toString(x).length();
        String arr[] = new String[len];
        for(int i =len-1;i>=0;i--){
            arr[i] = Integer.toString(x%10);
            x = (int)x/10;
        }
        for(int i = 0;i<len;i++){
            if((i+1)%2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        int o = Integer.parseInt(odd);
        System.out.println("First No. "+o);
        int e = Integer.parseInt(even);
        System.out.println("Second No. "+e);
        if(o > e){
            System.out.println(o+" > "+e);
        }
        else if(e > o){
            System.out.println(e+" > "+o);
        }
        else{
            System.out.println(e+" = "+o);
        }
    }

}

