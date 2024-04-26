package week1;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan veri alma
        System.out.println("1. sayı : ");
        a = inp.nextInt();

        System.out.println("2. sayı : ");
        b = inp.nextInt();

        System.out.println("3. sayı : ");
        c = inp.nextInt();

        // a sayısının en küçük olduğu durum
        if (( a < b ) && ( a < c )){
             if ( b < c ) {
                 System.out.println(a + "<" + b + "<" + c);
             } else {
                    System.out.println(a + "<" + c + "<" + b);
             }

        // b sayısının en küçük olduğu durum
        } else if (( b < c ) && ( b < a )) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + b);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }


        // c sayısının en küçük olduğu durum
        }else if ((c < a) && (c < b )){
            if (a < b ){
                System.out.println(c + "<" + a + "<" + b);
            }else {
                System.out.println(c + "<" + b + "<" + a);
            }
        }


    }
}
