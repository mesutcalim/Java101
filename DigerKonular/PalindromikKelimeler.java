package DigerKonular;

import java.util.Scanner;

public class PalindromikKelimeler {
        static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.print("Sorgulamak istediğiniz kelimeyi giriniz:  ");
            String str=input.next();
            if(isPalindrome(str)){
                System.out.println(str+ " kelimesi bir palindromik kelimedir.");
            }
            else
                System.out.println(str+" kelimesi bir palindromik kelime değildir.");

        }
    }
