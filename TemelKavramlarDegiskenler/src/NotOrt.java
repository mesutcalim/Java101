
 import java.util.Scanner;

        public class NotOrt {
            public static void main(String[] args) {
                int mat,fiz,kim,muz,turk,tar;
                Scanner input= new Scanner(System.in);

                System.out.print("Matematik notunuzu giriniz:");
                mat = input.nextInt();
                System.out.println("Matematik notunuz:"+ mat);

                System.out.print("Fizik notunuzu giriniz:");
                fiz = input.nextInt();
                System.out.println("Fizik notunuz:"+ fiz);

                System.out.print("Kimya notunuzu giriniz:");
                kim = input.nextInt();
                System.out.println("Kimya notunuz:"+ kim);

                System.out.print("Müzik notunuzu giriniz:");
                muz = input.nextInt();
                System.out.println("Müzik notunuz:"+ muz);

                System.out.print("Türkçe notunuzu giriniz:");
                turk = input.nextInt();
                System.out.println("Türkçe notunuz:"+ turk);

                System.out.print("Tarih notunuzu giriniz:");
                tar = input.nextInt();
                System.out.println("Tarih notunuz:"+ tar);

                int toplam = mat + fiz + kim + muz + tar + turk;
                double sonuc = toplam/6;

                boolean sınıfgecme = sonuc>= 60 ;
                String durum  = sınıfgecme ? "Geçtiniz" : "Kaldınız";

                System.out.println("Ortalamanız\t" + sonuc + "\tolduğundan\t" + durum);

            }
        }





