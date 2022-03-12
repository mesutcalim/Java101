package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssünü almak istediğnizz sayıyı giriniz:  ");
        n=input.nextInt();
        System.out.print("Kaçıncı üssünü almak istiyorsunuz:  ");
        k=input.nextInt();

        for(int i=1;i<=k;i++)
            total*=n;
        System.out.println("Sonuç:  "+ total);
    }
}
