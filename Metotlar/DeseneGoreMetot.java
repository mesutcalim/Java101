import java.util.Scanner;

public class DeseneGoreMetot {
    static void number(int number, int count){
        int result=number-5;
        System.out.print(result+" ");

        count++;

        if (result ==0 || result<0) {
            reverse(count, result);

        } else {
            number(result,count);
        }
    }
    static void reverse(int count, int result){

        for (int i = 0; i < count; i++) {
            result+=5;
            System.out.print(result+" ");
        }
    }

    public static void main(String[] args) {
        int sayac=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int number=scan.nextInt();

        System.out.print(number+" ");

        number(number, sayac);
    }
}