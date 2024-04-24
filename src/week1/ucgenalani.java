package week1;
import java.util.Scanner;

public class ucgenalani {
    public static void main(String[] args) {
        int a, b ,c ;
        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        System.out.println("Üçgen kenarı giriniz : " + a);
        b = inp.nextInt();
        System.out.println("Üçgen kenarı giriniz : " + b);
        c = inp.nextInt();
        System.out.println("Üçgen kenarı giriniz : " + c);
        int u = (a + b + c) / 2 ;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgeninizin Alanı : " + alan );



    }
}
