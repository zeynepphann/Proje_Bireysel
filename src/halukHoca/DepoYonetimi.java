package halukHoca;

public class DepoYonetimi {
    public static int id;
    public static String urunIsmi;
    public static String uretici;
    public static int miktar;
    public static String birim;
    public static int raf; //0 geliyor


    public DepoYonetimi(String urunAdi, String uretici, String birim, int id) {
        this.urunIsmi = urunAdi;
        this.uretici = uretici;
        this.birim = birim;
        this.id=id;

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

    public DepoYonetimi(String urunIsmi, String uretici, int miktar, String birim, int raf, int id) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
        this.id=id;

    }
}
