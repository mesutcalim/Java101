package Employee;

public class Employee {
    String isim;
    double maas;
    int saat;
    int baslangicYili;
    int bonus;
    double vergi;
    double zam;

    Employee(String isim, double maas, int saat, int baslangicYili) {
        this.isim = isim;
        this.maas = maas;
        this.saat = saat;
        this.baslangicYili = baslangicYili;
    }

    void vergi() {
        if (maas > 0 && maas < 1000)
            this.vergi = vergi;
        else if (maas >1000)
            this.vergi = this.maas * 0.03;
        else
            System.out.println("Yanlış maaş değeri girdiniz!");
    }

    void bonus() {
        if (saat > 40)
            this.bonus = (this.saat - 40) * 30;
        else if (saat <= 0)
            System.out.println("Yanlış çalışma saati girdiniz!");
        else
            this.bonus = 0;

    }


    void zam() {
        if (2021 - baslangicYili < 10)
            this.zam = this.maas * 0.05;
        else if ((2021 - baslangicYili > 10) && (2021 - baslangicYili < 20))
            this.zam = (this.maas * 0.10);
        else
            this.zam = (this.maas * 0.15);
    }

    void printEmployee() {
        System.out.println("Adı : " + this.isim);
        System.out.println("Maaşı : " + this.maas);
        System.out.println("Çalışma Saati : " + this.saat);
        System.out.println("Başlangıç Yılı : " + this.baslangicYili);
        System.out.println("Vergi : " + this.vergi);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.zam);
        System.out.println("Vergi ve Bonus Maaşlar ile birlikte maaşlar : " + (this.maas + this.bonus - this.vergi));
        System.out.println("Toplam Maaş" + ((this.maas + this.bonus - this.vergi) + (this.zam)));
    }
}
