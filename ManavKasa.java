import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double Elma,Armut,Domates,Muz,Patlican,fiyat;
        Scanner input= new Scanner(System.in);

        System.out.print("Elma kaç kilo:");
        Elma= input.nextDouble();

        System.out.print("Armut kaç kilo:");
        Armut= input.nextDouble();

        System.out.print("Domates kaç kilo:");
        Domates= input.nextDouble();

        System.out.print("Muz kaç kilo:");
        Muz= input.nextDouble();

        System.out.print("Patlican kaç kilo:");
        Patlican= input.nextDouble();

        fiyat= Elma*3.67+ Armut*2.14+ Domates*1.11+ Muz*0.95+ Patlican*5.00;
        System.out.println("Ödemeniz gereken tutar: "+ fiyat);
    }
}
