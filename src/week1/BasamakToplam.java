package week1;
import java.util.Scanner;
public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int toplam = 0;

        while (number > 0){
            toplam += number % 10;
            number /= 10;

        }
        System.out.println(toplam);



        }
    }


