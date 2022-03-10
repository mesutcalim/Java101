import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username = "mesut",password = "1234", usernameInput, passwordInput;
        int durum;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        usernameInput = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        passwordInput = input.nextLine();

        if (username.equals(usernameInput) && (password.equals(passwordInput)))
        {
            System.out.println("Giriş yaptınız!");
        }
        else
        {
            System.out.println("Yanlış kullanıcı adı yada şifre girdiniz.");
            System.out.println("Şifrenizi unuttu iseniz ve yenilemek isterseniz 1,\nÇıkmak için 2 yazınız.");

            durum = input.nextInt();

            if (durum == 1) {

                boolean yenileme=true;

                while (yenileme==true)
                {
                    System.out.print("yeni şifre giriniz:\n");
                    String passwordYeni= input.next();

                    if (password.equals(passwordYeni))
                    {
                        System.out.println("Yeni Şifre eskisi ile aynı olamaz.\nLütfen başka şifre deneyiniz.");
                    }
                    else
                    {
                        password=passwordYeni;
                        yenileme=false;
                        System.out.println("Şifre oluşturuldu.");

                    }
                }
            }
            else
                System.out.println("Çıkış Yapıldı");
        }
    }
}
