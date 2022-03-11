import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day,month;
        String burc=  "Burc";
        Boolean hata= false;

        Scanner input= new Scanner(System.in);
        System.out.print("Doğduğunuz günü giriniz ");
        day=input.nextInt();
        System.out.print("Doğduğunuz ayı giriniz:  ");
        month =input.nextInt();

        if(month==1){
            if(day<=31&& day>0)
            burc = day<=21 ? "Oğlak": "Kova";
            else hata=true;}
        else if(month==2){
            if(day<=28&& day>0)
            burc =day<=19  ? "Kova" : "Balık";
            else hata=true;}
        else if(month==3){
            if(day<=31&& day>0)
            burc =day<=20  ? "Balık" : "Koç";
            else hata=true;}
        else if(month==4){
            if(day<=30&& day>0)
            burc =day<=20  ? "Koç" : "Boğa";
            else hata=true;}
        else if(month==5){
            if(day<=31&& day>0)
            burc =day<=21  ? "Boğa" : "İkizler";
            else hata=true;}
        else if(month==6){
            if(day<=30&& day>0)
            burc =day<=22  ? "İkizler" : "Yengeç";
            else hata=true;}
        else if(month==7){
            if(day<=31&& day>0)
            burc =day<=22  ? "Yengeç" : "Aslan";
            else hata=true;}
        else if(month==8){
            if(day<=31&& day>0)
            burc =day<=22  ? "Aslan" : "Başak";
            else hata=true;}
        else if(month==9){
            if(day<=30&& day>0)
            burc =day<=22  ? "Başak" : "Terazi";
            else hata=true;}
        else if(month==10){
            if(day<=31&& day>0)
            burc =day<=22  ? "Terazi" : "Akrep";
            else hata=true;}
        else if(month==11){
            if(day<=30&& day>0)
            burc =day<=21  ? "Akrep" : "Yay";
            else hata=true;}
        else if(month==12){
            if(day<=31&& day>0)
            burc =day<=21  ? "Yay" : "Oğlan";
            else hata=true;}

        else
            hata=true;

if(hata==true)
    System.out.println("Hatalı giriş yaptınız.");
else
    System.out.println("Burcunuz "+burc);
    }
}
