package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args) {
    int[] dizi= {56, 34, 1, 8, 101, -2, -33,0};
    System.out.println("Dizi : "+Arrays.toString(dizi));
    Scanner input = new Scanner(System.in);
    System.out.print("Girilen Sayı: ");
    int a = input.nextInt();
    dizi[7] = a;
        Arrays.sort(dizi);
        int index = Arrays.binarySearch(dizi,a);
        if (index<=0)
            index=1;
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+ dizi[index-1]);
        if(index+1 >= dizi.length)
            index--;
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+ dizi[index+1]);
}
}
