package Donguler;

public class AsalSayilar {
    public static void main(String[] args) {

        for(int i=2;i<=100;i++){
            int x=0;
            for(int j=1;j<i;j++){
                if(i%j==0)
                    x+=1;
            }
            if(x<=1)
                System.out.print(i+"  ");
        }
    }
}
