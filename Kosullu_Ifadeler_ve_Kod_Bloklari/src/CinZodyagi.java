import java.sql.SQLOutput;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year,value=0;
        String burc=" ";
        boolean hata = false;
        Scanner input= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year=input.nextInt();

        if(year>=0){
            value=year%12;
            switch(value) {
                case 0:
                    burc = "Maymun";
                    break;
                case 1:
                    burc = "Horoz";
                    break;
                case 2:
                    burc = "Köpek";
                    break;
                case 3:
                    burc = "Domuz";
                    break;
                case 4:
                    burc = "Fare";
                    break;
                case 5:
                    burc = "Öküz";
                    break;
                case 6:
                    burc = "Kaplan";
                    break;
                case 7:
                    burc = "Tavşan";
                    break;
                case 8:
                    burc = "Ejderha";
                    break;
                case 9:
                    burc = "Yılan";
                    break;
                case 10:
                    burc = "At";
                    break;
                case 11:
                    burc = "Koyun";
                    break;

        }}
        else {System.out.println("Hatalı değer girdiniz.");
        hata=true;}
        if(hata==false)
        System.out.println("Çin Zodyağı burcunuz: "+ burc);







    }
}
