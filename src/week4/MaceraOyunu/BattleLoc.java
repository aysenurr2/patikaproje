package week4.MaceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    boolean onLocation() {
        int monsNumber = this.ranbomMonsterNumber();

        System.out.println("Şu an Buradasınız : " + this.getName());
        System.out.println("Dikkatli ol ! Burada " + monsNumber+ " tane " + this.getMonster().getName() + " yaşıyor !");
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = inp.nextLine().toUpperCase();
        if (selectCase.equals("S")) {
            if (combat(monsNumber)){
                System.out.println(this.getName() + "tüm düşmanları yendiniz ! ");
                return true;
            }
        }

        if (this.getPlayer().getHealthy() <= 0){
            System.out.println("Öldünüz...");
            return false;
        }
        return true;
    }

    public boolean combat(int monsNumber){

        for (int i = 1 ; i <= monsNumber; i++) {
            playerStats();
            monsterStats(i);

            while (this.getPlayer().getHealthy() > 0 && this.getMonster().getHealth() > 0) {
                System.out.println("<V>ur veya <K>aç : ");
                String selectCombat = inp.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz ! ");
                    this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar Size Vurdu ! ");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monsterDamage < 0) {
                            monsterDamage = 0;
                        }

                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - monsterDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealthy()){
                System.out.println("Düşmanı Yendiniz !");
                System.out.println(this.getMonster().getAward() + "para kazandınız ! ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            }
        }
        return false;
    }


    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealthy());
        System.out.println(this.getMonster().getName() + "Canı : " + this.getMonster().getHealth());
        System.out.println();
    }

    public void playerStats(){
        System.out.println("OYUNCU DEĞERLERİ");
        System.out.println("-------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealthy());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());

    }

    public void monsterStats(int i){
        System.out.println( i + "." + this.getMonster().getName() + " Değerleri");
        System.out.println("---------------------------");
        System.out.println("Sağlık : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Ödül : " + this.getMonster().getAward());

    }

    public int ranbomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }


}
