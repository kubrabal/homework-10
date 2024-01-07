package org.example;

import java.util.ArrayList;

public class Gezegenler {

    public void listele() {
        // ArrayList
        ArrayList<GezegenlerEnum> gezegenlerListesi = new ArrayList<>();
        gezegenlerListesi.add (GezegenlerEnum.MERKUR);
        gezegenlerListesi.add (GezegenlerEnum.VENUS);
        gezegenlerListesi.add (GezegenlerEnum.DUNYA);
        gezegenlerListesi.add (GezegenlerEnum.MARS);
        gezegenlerListesi.add (GezegenlerEnum.JUPITER);
        gezegenlerListesi.add (GezegenlerEnum.SATURN);
        gezegenlerListesi.add (GezegenlerEnum.URANUS);
        gezegenlerListesi.add (GezegenlerEnum.NEPTUN);

        for (GezegenlerEnum gezegen : gezegenlerListesi) {
            System.out.println (gezegen.getSiraNo() + " numaralı gezegen " + gezegen.getGezegenAdi() + ". Uzaklığı; " + gezegen.getUzaklik() + " km mesafedir." + " Yarıçapı; " + gezegen.getYariCap() + " km. " + "Dönme hızı; " + gezegen.getDonmeHizi() + " km.");
        }
    }
}