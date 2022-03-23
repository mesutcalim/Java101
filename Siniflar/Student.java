package Siniflar;
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matSozlu,int matSinav, int fizikSozlu,int fizikSinav, int kimyaSozlu,int kimyaSinav) {

        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.note1 = matSozlu;
        }
        if (matSinav >= 0 && matSinav <= 100) {
            this.mat.note2 = matSinav;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.note1 = fizikSozlu;
        }
        if (fizikSinav >= 0 && fizikSinav <= 100) {
            this.fizik.note2 = fizikSinav;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.note1 = kimyaSozlu;
        }
        if (kimyaSinav >= 0 && kimyaSinav <= 100) {
            this.kimya.note2 = kimyaSinav;
        }

    }

    public void isPass() {
        if (this.mat.note1 == 0 || this.fizik.note1 == 0 || this.kimya.note1 == 0 || this.mat.note2 == 0 || this.fizik.note2 == 0 || this.kimya.note2 == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.note = (this.fizik.note1*0.8+this.fizik.note2*0.2);
        this.kimya.note = (this.kimya.note1*0.8+this.kimya.note2*0.2);
        this.mat.note = (this.mat.note1*0.8+this.mat.note2*0.2);
        this.avarage = (this.fizik.note + this.kimya.note  + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}