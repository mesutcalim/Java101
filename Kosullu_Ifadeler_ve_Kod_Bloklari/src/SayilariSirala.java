import java.util.Scanner;

public class SayilariSirala {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input= new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("2.sayıyı giriniz:");
        b=input.nextInt();
        System.out.print("3.sayıyı giriniz:");
        c=input.nextInt();

        if(a>b && a>c)
            if(b>c) System.out.println("a>=b>=c");
            else if(c>b) System.out.println("a>c>b");
            else System.out.println("a>b=c");

        else if(b>a && b>c)
            if(a>c) System.out.println("b>a>c");
            else if(c>a) System.out.println("b>c>a");
            else System.out.println("b>c=a");

        else if(c>a && c>b)
            if(b>a) System.out.println("c>b>a");
            else if(a>b) System.out.println("c>a>b");
            else System.out.println("c>b=a");

        else if(a==b&&a>c)
             System.out.println("a=b>c");

        else if(a==c&& a>b)
            System.out.println("a=c>b");

        else if(b==c&& b>a)
            System.out.println("b=c>a");

        else
            System.out.println("a=b=c");

    }
}
