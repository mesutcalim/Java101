import java.util.Scanner;

public class KitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz:");
        kilo=input.nextInt();

        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();

        indeks= kilo/(boy*boy);
        System.out.println("Vücud kitle indeksiniz: "+ indeks);

    }
}
