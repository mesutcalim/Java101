import javax.swing.*;
import java.util.Scanner;

public class BiletHesaplama {
    public static void main(String[] args) {
        double km,age,secim,tutar=0;
        boolean hata=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Km cinsinden mesafe giriniz: ");
        km=input.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        age=input.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        secim= input.nextDouble();

        if(km>0)
        {
            tutar=km*0.10;
            if(age>0) {
                if (age < 12)
                    tutar /= 2;
                else if (age >= 12 && age <= 24)
                    tutar = tutar - (tutar * 0.10);
                else if (age > 65)
                    tutar = tutar - (tutar * 0.30);
            }
            else
                hata=true;

        }
        else
            hata=true;
        if(secim==2) {
            tutar = tutar - (tutar * 0.20);
            tutar *= 2;
        }
        if(hata==true)
            System.out.println("Hatalı değer girdiniz.");
        else
        System.out.println("Ödemeniz gereken tutar: "+ tutar);




    }
}
