import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        double n1,n2;
        int islem;

        Scanner input= new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        n1= input.nextInt();

        System.out.println("ikinci sayıyı giriniz:");
        n2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz.\n1.Toplama\n2.Çıkartma\n3.Çarpma\n4.Bölme\nSeçiminiz:");
        islem=input.nextInt();
        switch (islem){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
                case 3:
                    System.out.println(n1*n2);
                    break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Girdileriniz hatalıdır.");
                break;
        }

    }
}
