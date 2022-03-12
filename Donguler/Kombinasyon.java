package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        long a,n,r,c,total1=1,total2=1,total3=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyon için 1.sayıyı giriniz:");
        n=input.nextInt();
        System.out.print("Kombinasyon için 2.sayıyı giriniz:");
        r=input.nextInt();

        a=n-r;

        for(int i=1;i<=n;i++)
            total1*=i;

        for(int i=1;i<=a;i++)
            total2*=i;

        for(int i=1;i<=r;i++)
            total3*=i;
        c=total1/(total3*total2);

        System.out.print("Kombinasyon sonucu:   "+c);
    }
}
