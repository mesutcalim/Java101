package BitirmeOdevi;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static void TarlaBastir(char[][] tarla, int a, int b,char[][] tarlaAcik) {



        System.out.println("---------Oyun Başladı--------");
        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[i].length; j++) {
                tarlaAcik[i][j]='-';
                System.out.print(tarlaAcik[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void OpenChar(int c, int d, char tarla[][],char[][] tarlaAcik) {
        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[i].length; j++) {
                if(c==i & d==j) {
                    tarlaAcik[i][j] = tarla[i][j];
                }
                    System.out.print(tarlaAcik[i][j] + " ");
                }
            System.out.println(" ");
        }}
       public static void oyna() {
        int c,d;

        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.print("Satır Sayısı Giriniz: ");
        int a = input.nextInt();
        System.out.print("Sutun Sayısını Giriniz: ");
        int b = input.nextInt();
        char[][] tarla = new char[a][b];
        char[][] tarlaAcik = new char[a][b];
        char[][] tarlaBomba = new char[a][b];
        tarla=tarlaAcik;
        tarla=tarlaBomba;
        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[i].length; j++) {
                tarla[i][j] = 'X';
            }
            System.out.println(" ");
        }

        int bombaSayisi = (a * b) / 4;
        for (int i = 0; i < bombaSayisi; i++) {
            int k = rastgele.nextInt(a);
            int l = rastgele.nextInt(b);
            if (tarlaBomba[k][l] == '*')
                i--;
            else
                tarlaBomba[k][l] = '*';
        }
        System.out.println("--------Bombalar----------");
        for (int i = 0; i < tarla.length; i++) {
                for (int j = 0; j < tarla[i].length; j++) {
                    System.out.print(tarlaBomba[i][j] + " ");
                }
                System.out.println(" ");
            }


        TarlaBastir(tarla, a, b,tarlaAcik);
            do {
                System.out.print("Satır Sayısı Giriniz: ");
                c = input.nextInt();
                System.out.print("Sutun Sayısını Giriniz: ");
                d = input.nextInt();
                OpenChar(c, d, tarla,tarlaAcik);
            }
            while (tarlaAcik[c][d] != '*');


        }
    }