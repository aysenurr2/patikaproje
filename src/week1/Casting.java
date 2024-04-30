package week1;
import java.util.Scanner;
public class Casting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tamSayi;
        double ondalikliSayi;

        //kullanıcıdan veri alma
        System.out.println("Tam sayı giriniz: ");
        tamSayi = inp.nextInt();

        System.out.println("Ondalıklı sayı giriniz (örn:1,3) : ");
        ondalikliSayi = inp.nextDouble();


        // Tam sayının ondalıklı sayıya dönüştürülmesi
        double tamSayiDouble = tamSayi;

        // Ondalıklı sayının tam sayıya dönüştürülmesi
        int ondalikliSayiInt = (int) ondalikliSayi;

        // Sonuçların ekrana yazdırılması
        System.out.println("Girilen tam sayı: " + tamSayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Tam sayının ondalıklı sayıya dönüştürülmüş hali: " + tamSayiDouble);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmüş hali: " + ondalikliSayiInt);
    }

    }

