package hastaneOtomasyonu2;

public class Doktor {

    String hastaDurum;
    String isim;
    String soyIsim;
    String unvan;

    public Doktor(String hastaDurum , String unvan,String isim, String soyIsi) {
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
}
