package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n:  ");
        int n= input.nextInt();
        int dizi[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1 +". Eleman: ");
            dizi[i]= input.nextInt();

        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: "+ Arrays.toString(dizi));
    }
}
