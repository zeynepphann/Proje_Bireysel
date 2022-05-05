package hastaneOtomasyonu;

import java.util.Scanner;

public class HastaneRunner {

    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {
        String hastaDurumu = "Kalp hastaliklari";
        String unvan  = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));
        System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane.getDoktor().getUnvan());

    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane.unvanlar[0];
        } else if (aktuelDurum.equalsIgnoreCase("Bas Agrisi")) {
            return hastane.unvanlar[1];
        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane.unvanlar[2];
        } else if (aktuelDurum.equalsIgnoreCase("Soguk Alginligi")) {
            return hastane.unvanlar[3];
        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane.unvanlar[4];
        } else if (aktuelDurum.equalsIgnoreCase("Kalp Hastaliklari")) {
            return hastane.unvanlar[5];

        }
        return "yanlis unvan ";
    }
    public static Doktor doktorBul(String unvan){
        Doktor doktor= new Doktor();

        for (int i = 0; i <hastane.unvanlar.length ; i++) {
            doktor.setIsim(hastane.doctorIsimleri[i]);
            doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
            doktor.setUnvan(unvan);

        }
        return doktor;
    }
}

