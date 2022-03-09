import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        double fiyat,kdvliFiyat;
        Scanner input= new Scanner(System.in);
        System.out.print("Ürün fiyatı giriniz:");
        fiyat = input.nextDouble();
        System.out.println("Ürün fiyatı:  "+ fiyat +"  olarak eklendi.");
        double kdvOranı = fiyat>=1000 ?  0.08 : 0.18 ;
        kdvliFiyat=fiyat+fiyat*kdvOranı;

        System.out.println("Ürünün kdvli fiyatı  "+ kdvliFiyat + "   tutarındadır.");



    }
}
