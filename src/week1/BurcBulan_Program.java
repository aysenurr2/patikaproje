package week1;

import java.util.Scanner;

public class BurcBulan_Program {
    public static void main(String[] args) {
        int month, day;

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğduğunuz Ayı Giriniz : ");
        month = inp.nextInt();

        System.out.println("Doğduğunuz Günü Giriniz : ");
        day = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31){
                if (day < 22) {
                    System.out.println("Oğlak Burcusunuz");
                } else {
                    System.out.println("Kova Burcusunuz");
                }
            } else {
                System.out.println("Geçersiz gün girdiniz. ");
            }
        } else if (month == 2 ) {
            if (day >= 1 && day <= 29){
                if (day < 20 ){
                    System.out.println("Kova Burcusunuz");
                } else {
                    System.out.println("Balık Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 3) {
            if (day >= 1 && day <= 31){
                if (day < 21){
                    System.out.println("Balık Burcusunuz");
                }else {
                    System.out.println("Koç Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Koç Burcusunuz");
                } else {
                    System.out.println("Boğa Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Boğa Burcusunuz");
                } else {
                    System.out.println("İkizler Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("İkizler Burcusunuz");
                } else {
                    System.out.println("Yengeç Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Yengeç Burcusunuz");
                } else {
                    System.out.println("Aslan Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Aslan Burcusunuz");
                } else {
                    System.out.println("Başak Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Başak Burcusunuz");
                } else {
                    System.out.println("Terazi Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Terazi Burcusunuz");
                } else {
                    System.out.println("Akrep Burcusunuz ");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Akrep Burcusunuz");
                } else {
                    System.out.println("Yay Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Yay Burcusunuz");
                } else {
                    System.out.println("Oğlak Burcusunuz");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz. ");
            }

        } else {
            System.out.println("Geçersiz ay girdiniz");
        }

    }
}
