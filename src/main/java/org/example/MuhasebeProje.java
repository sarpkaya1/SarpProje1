package org.example;

public class MuhasebeProje {

    int calisilanGun;
    int gunlukUcret = 2000;
    int mesaiUcreti = 1000;
    int sabitMesaiSuresi = 25;

    void hesapla(String isim) {
        int normalUcret = calisilanGun * gunlukUcret;
        int toplamUcret = (sabitMesaiSuresi * gunlukUcret) + ((calisilanGun - sabitMesaiSuresi ) * mesaiUcreti);

        if (calisilanGun > 25){
            System.out.println(isim + " Kişisi" + toplamUcret + " TL maaş almıştır.");
        }else{
            System.out.println(isim + "Kişisi" + normalUcret + " TL maaş almıştır.");


        }

    }
}
