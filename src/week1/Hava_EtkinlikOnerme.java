package week1;

import java.util.Scanner;

public class Hava_EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan veri alma
        System.out.println("Derece giriniz : ");
        int derece = inp.nextInt();

        //dereceye göre etkinlik önerme
       if (derece<=5) {
           System.out.println("Kayak etkinliği yapabilirsiniz. ");

       } else if (derece<=15) {
           System.out.println("Sinema etkinliği yapabilirsiniz. ");

       } else if (derece<=25) {
           System.out.println("Piknik etkinliği yapabilirsiniz. ");

       } else  {
           System.out.println("Yüzme etkinliği yapabilirsiniz. ");

       }
    }
}
