package halukHoca;

public class DepoYonetimi {
    private  int id;
    private  String urunIsmi;
    private  String uretici;
    private  int miktar=0;
    private  String birim;
    private  int raf;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }



    public DepoYonetimi(int id, String urunIsmi, String uretici,int miktar, String birim, int raf) {
        this.id=Islemler.id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar=miktar;
        this.birim = birim;
        this.raf=Islemler.raf;


    }
    @Override
    public String toString() {
        return "DepoYonetimi{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf=" + raf +
                '}';
    }

    public DepoYonetimi() {

    }


}
