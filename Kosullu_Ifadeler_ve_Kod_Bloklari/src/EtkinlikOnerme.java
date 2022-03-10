import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        double isi;

        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        isi= input.nextDouble();

        if(isi<5) System.out.println("Kayak yapabilirsiniz.");
        else if(5<isi && isi<10) System.out.println("Sinemaya gidebilirsiniz.");
        else if(10<isi && isi<15) System.out.println("Sinemaya gidebilirsiniz.\nPiknik yapmaya gidebilirsiniz.");
        else if(15<isi && isi<25) System.out.println("Piknik yapmaya gidebilirsiniz.");
        else System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
