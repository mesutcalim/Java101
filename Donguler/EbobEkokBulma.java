package Donguler;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.print("1.sayıy giriniz:  ");
        n1=input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        n2=input.nextInt();
        int ebob=1;
        int k=n1;
        int i=1;
        while(k>=1){
            if(n1%k==0&&n2%k==0){
                ebob=k;
                break;
            }
        k--;}

        while(i<=(n1*n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                break;
            }
            i++;
        }
        System.out.println("Ekok: "+i+ "  Ebob:  "+ebob);
    }
}
