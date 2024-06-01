package week4.MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Player player;
    private Scanner inp = new Scanner(System.in);


    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.println("Lütfen Bir İsim Giriniz : ");
        String playerName = inp.nextLine();

        Player player = new Player(playerName);
        System.out.println((player.getName() + " Macera Oyununa Hoşgeldin ! "));
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("---------------Bölgeler--------------");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Güvenli ev! Düşman yok. ");
            System.out.println("2 - Eşya Dükkanı --> Silah veya Zırh Satın Alabilirsiniz. ");
            System.out.println("3 - Mağara --> Ödül <Yemek> , dikkatli ol karşına zombi çıkabilir ! . ");
            System.out.println("4 - Orman --> Ödül <Odun> , dikkatli ol karşına vampir çıkabilir ! . ");
            System.out.println("5 - Nehir --> Ödül <Su> , dikkatli ol karşına ayı çıkabilir ! . ");

            System.out.println("0 - Çıkış Yap  --> Oyunu Sonlandır. ");


            System.out.println("Lütfen Gitmek İstediğiniz Bölgeyi Seçiniz : ");
            int selectLoc = inp.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz ! ");
            }


            if (location == null) {
                System.out.println(" Oyundan Çıkış Yaptınız :( Yine bekleriz. ");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }

        }
    }
}






