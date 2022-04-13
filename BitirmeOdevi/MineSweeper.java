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

    public static int OpenChar(int c, int d, char tarla[][],char[][] tarlaAcik,int sayac) {

        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[i].length; j++) {
                if (c == i & d == j) {
                    tarlaAcik[i][j] = tarla[i][j];
                }
                System.out.print(tarlaAcik[i][j] + " ");
            }
            System.out.println(" ");

        }
        return sayac;
    }
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
                tarla[i][j] = '0';
            }
            System.out.println(" ");
        }

        int bombaSayisi = (a * b) / 4;
        int sure= (a*b)-((a*b)/4);
        int sayac=0;
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

           for (int i = 0; i < tarla.length; i++) {
               for (int j = 0; j < tarla[i].length; j++) {
                   if (tarlaBomba[i][j] == '*') {
                       if (i + 1 < tarla.length & j + 1 < tarla[i].length) {
                           if (i == 0 & j > 0) {
                               for (int n1 = i; n1 <= i + 1; n1++) {
                                   for (int n2 = j - 1; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           } else if (i > 0 & j == 0) {
                               for (int n1 = i - 1; n1 <= i + 1; n1++) {
                                   for (int n2 = j; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           } else if (i == 0 & j == 0) {
                               for (int n1 = i; n1 <= i + 1; n1++) {
                                   for (int n2 = j; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           }
                       }
                       else if (i + 1 > tarla.length & j + 1 < tarla[i].length)
                           if (i == 0 & j > 0) {
                               for (int n1 = i; n1 <= i + 1; n1++) {
                                   for (int n2 = j - 1; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           } else if (i > 0 & j == 0) {
                               for (int n1 = i - 1; n1 <= i + 1; n1++) {
                                   for (int n2 = j; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           } else if (i == 0 & j == 0) {
                               for (int n1 = i; n1 <= i + 1; n1++) {
                                   for (int n2 = j; n2 <= j + 1; n2++) {
                                       if (n1 == i & n2 == j)
                                           tarlaBomba[n1][n2] = '*';
                                       else
                                           tarlaBomba[n1][n2] += 1;
                                   }
                               }
                           }

                       else if (i+1<tarla.length  & j + 1 > tarla[i].length){
                               if (i == 0 & j > 0) {
                                   for (int n1 = i; n1 <= i + 1; n1++) {
                                       for (int n2 = j - 1; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               } else if (i > 0 & j == 0) {
                                   for (int n1 = i - 1; n1 <= i + 1; n1++) {
                                       for (int n2 = j; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               } else if (i == 0 & j == 0) {
                                   for (int n1 = i; n1 <= i + 1; n1++) {
                                       for (int n2 = j; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               }
                       }
                       else if (j + 1 > tarla[i].length & i+1 > tarla.length){
                               if (i == 0 & j > 0) {
                                   for (int n1 = i; n1 <= i + 1; n1++) {
                                       for (int n2 = j - 1; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               } else if (i > 0 & j == 0) {
                                   for (int n1 = i - 1; n1 <= i + 1; n1++) {
                                       for (int n2 = j; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               } else if (i == 0 & j == 0) {
                                   for (int n1 = i; n1 <= i + 1; n1++) {
                                       for (int n2 = j; n2 <= j + 1; n2++) {
                                           if (n1 == i & n2 == j)
                                               tarlaBomba[n1][n2] = '*';
                                           else
                                               tarlaBomba[n1][n2] += 1;
                                       }
                                   }
                               }
                       }
                   }
               }
           }
        TarlaBastir(tarla, a, b,tarlaAcik);
            do {
                System.out.print("Satır Sayısı Giriniz: ");
                c = input.nextInt();
                System.out.print("Sutun Sayısını Giriniz: ");
                d = input.nextInt();
                OpenChar(c, d, tarla,tarlaAcik,sayac);
                sayac++;

            }
            while (tarlaAcik[c][d] != '*' & sure>sayac);
           if(tarlaAcik[c][d] == '*')
            System.out.println("Mayına bastınız.");
            if(sure==sayac)
                System.out.println("Kazandınz");
        }
}