/*
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı

Sınıfın Metotları:
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.

tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */
package patika_java101_oop.MaasHesap;
public class Employee {
  
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
    
    double bonus() {
         int dif, total = 0;
        if(this.workHours > 40)
            for (int i = 41; i <= this.workHours; i++) {
                dif = i % 10;
                total = dif;
            }
        return total * 30;
    }
    
    double raiseSalary() {
        double tempSalary = this.salary;
        int totalYear = 2021 - this.hireYear;
        if (totalYear < 10) {
            return tempSalary * 0.05;
        } else if (totalYear < 20) {
            return tempSalary * 0.10;
        } else {
            return tempSalary * 0.15;
        }
    }
    
    @Override
    public String toString() {
        return  "Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş :" + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş: " + (this.salary + raiseSalary() - tax() + bonus());
    }
    
}
