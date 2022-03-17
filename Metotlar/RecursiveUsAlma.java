package Metotlar;

import java.util.Scanner;

public class RecursiveUsAlma {
    public static void main(String[] args) {
        System.out.println(power());
    }
    static int power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:  ");
        int a=scan.nextInt();
        System.out.print("Üs değerini giriniz:  ");
        int b=scan.nextInt();
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;

        }
        return result;
    }

}
