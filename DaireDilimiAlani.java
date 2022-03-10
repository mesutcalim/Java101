import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        double a,r,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire dilimi yarıçapını giriniz:");
        r= input.nextDouble();

        System.out.println("Daire diliminin açısını giriniz:");
        a= input.nextDouble();

        alan=(3.14 * (r * r) * a)/360;

        System.out.println("Daire diliminin alanı "+ alan);
    }

}
