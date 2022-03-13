package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i=(n-1) ; i >= 0 ; i--) {
            for (int j=(n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k=(i*2)+1 ; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
    }
}}
