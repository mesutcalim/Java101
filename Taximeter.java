import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        double km,fiyat;
        Scanner input = new Scanner(System.in);

        System.out.println("Gidilen mesafeyi km cinsiden giriniz:");
        km= input.nextDouble();
        System.out.println("Gidilen mesafe:  "+ km);

        fiyat=10+(km*2.20);
        double odenecekFiyat = fiyat<=20 ? 20:fiyat;

        System.out.println("Ödemeniz gereken tutar:  " + odenecekFiyat);

    }
}
