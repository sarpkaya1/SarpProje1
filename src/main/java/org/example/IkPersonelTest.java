package org.example;

public class IkPersonelTest {
    public static void main(String[] args) {
        IkPersonel personel1 = new IkPersonel();
        IkPersonel personel2 = new IkPersonel();
        IkPersonel personel3 = new IkPersonel();
        IkPersonel personel4 = new IkPersonel();
        IkPersonel personel5 = new IkPersonel();


        personel1.mevkii = "Departman Müdürü";
        personel1.yas = 43;
        personel1.kullandigiProgram = "Java";
        personel1.toplamTecrube = 19;

        personel2.mevkii = "Takım Lideri";
        personel2.yas = 38;
        personel2.kullandigiProgram = "Pyton";
        personel2.toplamTecrube = 17;

        personel3.mevkii = "DevOps Mühendisi";
        personel3.yas = 33;
        personel3.kullandigiProgram = "Docker";
        personel3.toplamTecrube = 13;

        personel4.mevkii = "Development";
        personel4.yas = 28;
        personel4.kullandigiProgram = "Java ve Selenium";
        personel4.toplamTecrube = 9;

        personel5.mevkii = "Test Mühendisi";
        personel5.yas = 30;
        personel5.kullandigiProgram = "Java ve TestRail";
        personel5.toplamTecrube = 4;

        personel1.run("Alev");
        System.out.println("------------------");
        personel2.run("Buket");
        System.out.println("-------------------");
        personel3.run("Emre");
        System.out.println("--------------------");
        personel4.run("Buse");
        System.out.println("---------------------");
        personel5.run("Sarp");










    }



    }


