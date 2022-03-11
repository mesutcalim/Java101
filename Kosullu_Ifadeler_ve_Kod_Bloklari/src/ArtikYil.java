import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year,kalan1,kalan2,kalan3;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year= inp.nextInt();

        kalan1=year%4;
        kalan2=year&100;
        if(kalan2==0) {
            kalan3 = year % 400;
            if(kalan3==0)
                System.out.print(year + "  artık bir yıldır.");
            else
                System.out.println(year+ "  artık yıl değildir.");
        }
        else{
            if(kalan1==0)
                System.out.print(year + "  artık bir yıldır.");
            else
                System.out.println(year+ "  artık yıl değildir.");
    }}
}
