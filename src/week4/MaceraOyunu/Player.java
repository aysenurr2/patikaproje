package week4.MaceraOyunu;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private int damage;
    private int healthy;
    private int money;
    private int originalHealth;
    private String charName;
    private String name;
    private Scanner inp = new Scanner(System.in);
    private Inventory inventory;



    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){

        GameChar[] charList = {new Samurai(), new Archer() ,new Knight()};

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Karakterler");
        System.out.println("----------------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : "+ gameChar.getId() +
                    "\t Karakter :"+ gameChar.getName() +
                    " -->  Hasar: " +gameChar.getDamage() +
                    " \t Sağlık: " + gameChar.getHealth()+
                    " \t Para: " + gameChar.getMoney());
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Karakter Seçiniz : ");
        int selectChar = inp.nextInt();

        switch (selectChar) {
            case 1:
                initPLayer(new Samurai());
                break;
            case 2:
                initPLayer(new Archer());
                break;
            case 3:
                initPLayer(new Knight());
            default:
                initPLayer(new Samurai());
        }

        System.out.println("Seçilen karakter : " + this.getCharName() +
                "--> Hasar: " + this.getDamage() + "\tSağlık: " + this.getHealthy() + "\t Para: " + this.getMoney() );

    }

    public void initPLayer(GameChar gameChar){
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

    }

    public void printInfo(){
        System.out.println("Silah : " + this.getInventory().getWeapon().getName() +
                ", Zırh : " +this.getInventory().getArmor().getName()+
                ", Blokla : " + this.getInventory().getArmor().getBlock()+
                ", Hasar : " + this.getTotalDamage()+
                ", Sağlık : " + this.getHealthy() +
                ", Para : " + getMoney());
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public Scanner getInp() {
        return inp;
    }

    public void setInp(Scanner inp) {
        this.inp = inp;
    }
}
