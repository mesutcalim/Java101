package Donguler;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı değeri giriniz:  ");
        sayi= scan.nextInt();

        System.out.println("4'ün katları olan sayılar:");
        for (int i=1; i<=sayi; i*=4)
            System.out.println(i);

        System.out.println("5'in katları olan sayılar:");
        for(int i=1;i<=sayi;i*=5)
            System.out.println(i);
    }
}
