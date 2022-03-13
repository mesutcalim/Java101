package Donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Kaçıncı elemana kadar bulmak istiyorsunuz?: ");
        int n=input.nextInt();
        int a=0,b=1,c=1;
        System.out.print(a+"  "+b+"  ");
        for(int i=1;i<n-1;i++){
            c= (b+a);
            a=b;
            b=c;
            System.out.print(b+"  ");
        }

    }
}
