package Donguler;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int n,sayi,i=1,max=0,min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı sıralamak istiyorsunuz: ");
        n=input.nextInt();
        do{
            System.out.print(i+". sayıyı giriniz: ");
            sayi=input.nextInt();
            if(i==1){
                max=sayi;
                min=sayi;
            }
            if(sayi>=max){
                max=sayi;
            }
            if(sayi<=min){
                min=sayi;
            }
            i++;
        }while(n>=i);
        System.out.println("Max: "+max+"  Min:  "+ min);
    }
}
