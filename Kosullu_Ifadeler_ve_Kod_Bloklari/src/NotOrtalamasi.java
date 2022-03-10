
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fiz,kim,muz,turk;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        while(mat>100 || mat<0){
            System.out.println("Notunuz 100 ile 0 aralığında olmalıdır");
            System.out.print("Matematik notunuzu giriniz:");
            mat= input.nextInt();
        }
        System.out.println("Notunuz " + mat);


        System.out.print("Fizik notunuzu giriniz:");
        fiz = input.nextInt();
        while(fiz>100 || fiz<0){
            System.out.println("Notunuz 100 ile 0 aralığında olmalıdır");
            System.out.print("Fizik notunuzu giriniz:");
            fiz = input.nextInt();
        }

        System.out.println("Notunuz " + fiz);


        System.out.print("Kimya notunuzu giriniz:");
        kim = input.nextInt();
        while(kim>100 || kim<0){

            System.out.println("Notunuz 100 ile 0 aralığında olmalıdır");
            System.out.print("Kimya notunuzu giriniz:");
            kim = input.nextInt();
        }

        System.out.println("Notunuz " + kim);


        System.out.print("Müzik notunuzu giriniz:");
        muz = input.nextInt();
        while(muz>100 || muz<0){
            System.out.println("Notunuz 100 ile 0 aralığında olmalıdır");
            System.out.print("Müzik notunuzu giriniz:");
            muz = input.nextInt();
        }

        System.out.println("Notunuz " + muz);


        System.out.print("Türkçe notunuzu giriniz:");
        turk = input.nextInt();
        if(turk>100 || turk<0){
            System.out.println("Notunuz 100 ile 0 aralığında olmalıdır");
            System.out.print("Türkçe notunuzu giriniz:");
            turk = input.nextInt();
        }

        System.out.println("Notunuz " + turk);


        int toplam = mat + fiz + kim + muz + turk;

        double sonuc = toplam/5;

        boolean sınıfgecme = sonuc>= 55 ;
        String durum  = sınıfgecme ? "Geçtiniz" : "Kaldınız";
        System.out.println("Ortalamanız\t" + sonuc + "\tolduğundan\t" + durum);

    }
}





