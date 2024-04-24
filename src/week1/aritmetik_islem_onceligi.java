package week1;
import java.util.Scanner;

public class aritmetik_islem_onceligi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b ,c ;
        System.out.println("1.sayıyı giriniz : ");
        a = inp.nextInt();
        System.out.println("2.sayıyı giriniz : ");
        b = inp.nextInt();
        System.out.println("3.sayıyı giriniz : ");
        c = inp.nextInt();
        int islemSonucu = a+b*c-b;

        System.out.println(a + "+" + b + "*" + c + "-" + b);
        System.out.println("işlem sonucu: " + islemSonucu);

    }

}

