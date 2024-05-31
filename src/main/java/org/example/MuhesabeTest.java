package org.example;

public class MuhesabeTest {
    public static void main(String[] args) {
        MuhasebeProje calisan1 = new MuhasebeProje();
        MuhasebeProje calisan2 = new MuhasebeProje();
        MuhasebeProje calisan3 = new MuhasebeProje();
        MuhasebeProje calisan4 = new MuhasebeProje();


        calisan1.calisilanGun = 30;
        calisan2.calisilanGun = 25;
        calisan3.calisilanGun = 36;
        calisan4.calisilanGun = 32;

        calisan1.hesapla("Mehmet");
        calisan2.hesapla("Aslı");
        calisan3.hesapla("Alev");
        calisan4.hesapla("Cansu");


    }

}
