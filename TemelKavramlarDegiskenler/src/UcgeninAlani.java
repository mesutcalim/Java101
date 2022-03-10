import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin 1.kenar uzunluğunu giriniz:");
        a=input.nextDouble();

        System.out.println("Üçgenin 2.kenar uzunluğunu giriniz:");
        b=input.nextDouble();

        System.out.println("Üçgenin 3.kenar uzunluğunu giriniz:");
        c=input.nextDouble();

        System.out.println("Üçgenin alanı");

        u=(a+b+c)/2;
        alan= Math.sqrt(u * (u-a) * (u-b) * (u- c));

        System.out.println("Üçgenin alanı:  "+ alan);
    }
}
