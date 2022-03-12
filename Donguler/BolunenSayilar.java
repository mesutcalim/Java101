import java.util.Scanner;

public class BolunenSayilar {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=1;
        double ort;
        Scanner inp=new Scanner(System.in);
        System.out.print("0'dan büyük bir sayı giriniz: ");
        sayi= inp.nextInt();

        for(int i=1;i<=sayi; i++){

            if(i%12==0) {
                toplam += i;
                sayac++;
            }
        }
        if(sayac==1) sayac=2;
        ort=toplam/(sayac-1);
        System.out.println("3 ve 4 e bölünebilen sayıların ortalaması  "+ort);
    }
}
