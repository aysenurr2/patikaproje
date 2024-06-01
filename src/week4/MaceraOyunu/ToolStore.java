package week4.MaceraOyunu;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----Mağazaya Hoşgeldiniz !----");

        boolean showMenu  = true;
        while (showMenu) {
            System.out.println("1 - Silahlar ");
            System.out.println("2 - Zırhlar ");
            System.out.println("3 - Çıkış Yap ");
            System.out.println("Seçiminiz : ");
            int selectCase = Location.inp.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar giriniz");
                selectCase = inp.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmor();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Bir daha bekleriz ! ");
                    showMenu = false;
                    break;

            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("-----Silahlar-----");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() +
                    "< para : " + w.getPrice() +
                    ", Hasar : " + w.getDamage());
        }
        System.out.println("0 - Çıkış Yap");
    }


    public void buyWeapon() {
        System.out.println("Bir Silah Seçiniz : ");

        int selectWeaponID = inp.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz");
            selectWeaponID = inp.nextInt();
        }


        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli Paranız Yok.");
                } else {
                    //satın almanın gerçekleştiği alan
                    System.out.println(selectedWeapon.getName() + " silahını Satın Aldınız ! ");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }
    }

    public void printArmour() {
        System.out.println("-----Zırhlar-----");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName()
                    + "<Para: " + a.getPrice() +
                    ", Zırh: " + a.getBlock() + ">");
        }
        System.out.println("0 - Çıkış Yap");

    }

    public void buyArmor() {
        System.out.println("Bir Zırh Seçiniz : ");
        int selectArmorID = inp.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz");
            selectArmorID = inp.nextInt();
        }

        if (selectArmorID != 0 ){
            Armor selectedArmor = Armor.getArmorByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > getPlayer().getMoney()) {
                    System.out.println("Yeterli Paranız Yok.");
                } else {
                    //satın almanın gerçekleştiği alan
                    System.out.println(selectedArmor.getName() + " Zırhını Satın Aldınız ! ");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}

