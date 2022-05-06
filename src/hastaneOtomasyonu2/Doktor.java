package hastaneOtomasyonu2;

public class Doktor {

    String hastaDurum;
    String isim;
    String soyIsim;
    String unvan;
    String aciliyet;

    public Doktor(String hastaDurum, String isim, String soyIsim, String unvan, String aciliyet) {
        this.hastaDurum = hastaDurum;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.unvan = unvan;
        this.aciliyet=aciliyet;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public String toString() {
        return
                "\nBelirti=" + hastaDurum +
                "  Doktor ismi=" + isim  +
                "  Doktor Soy Isim=" + soyIsim +
                "  Doktorun Bulundugu Bolum=" + unvan +
                "  Aciliyet Durumu=" + aciliyet
                ;
    }
}
