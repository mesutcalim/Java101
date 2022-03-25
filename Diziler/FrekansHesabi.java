package Diziler;

import java.util.Arrays;

public class FrekansHesabi {
        public static void main(String[] args) {
            int[] dizi={10,20,20,10,10,20,5,20,67,78,0,56,43,29,10,10};
            int n=1;
            int a=0;
            Arrays.sort(dizi);
            System.out.println(Arrays.toString(dizi));


            for(int i=0;i< dizi.length;i++){
                if(dizi[i]!=a){


                    for(int j=0;j<dizi.length;j++){

                        if ((i!=j) && (dizi[i]==dizi[j])) {
                            n++;
                            a=dizi[i];
                        }
                    }
                    System.out.println(dizi[i] +" sayısı " + n + " kere tekrar edildi.");
                    n=1;

                }
            }
        }
    }
