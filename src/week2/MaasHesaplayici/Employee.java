package week2.MaasHesaplayici;

public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("kemal", 2000, 45, 1985);
        System.out.println(e1.toString());
        System.out.println("Vergi : " + e1.tax());
        System.out.println("bonus : " + e1.bonus());
        System.out.println("Maaş Artışı : " + e1.raisesalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (e1.salary - e1.tax() + e1.bonus())) ;
        System.out.println("Toplam Maaş : " + (e1.salary - e1.tax() + e1.bonus() + e1.raisesalary()));
    }


    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }
    double tax(){
        if (salary<1000){
            return salary;
        }
        else{
            return salary * 0.03;
        }

    }
    double bonus(){
        if(workHours>40){
            return (workHours - 40 ) * 30;
        }
        return salary;
    }

    double raisesalary(){
        double bonus;

        if(2021 - hireYear <10){
            bonus= salary * 1.05;
            return bonus - salary;

        } else if (2021-hireYear> 9 && 2021-hireYear<20) {
            bonus =  salary * 1.10;
            return bonus - salary;

        } else if (2021-hireYear>19){
            bonus = salary*1.15;
            return bonus - salary;
        }
        return salary;
    }

public String toString(){
        return "Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours + "\nBaşlangıç Yılı : " + this.hireYear;

}
}
