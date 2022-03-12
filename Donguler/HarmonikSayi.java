package Donguler;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int n;
        double total=0.0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Hangi sayıya kadar hesaplamak istiyorsunuz?: ");
        n=inp.nextInt();
        for(int i=1;i<=n;i++){
            total+=(1.0/i);
        }
        System.out.println("Sonuç:  "+ total);
    }
}
