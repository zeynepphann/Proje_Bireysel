package halukHoca;

public class DepoYonetimi {
    public  int id;
    public  String urunIsmi;
    public  String uretici;
    public  int miktar=0;
    public  String birim;
    public  int raf; //0 geliyor


    public DepoYonetimi(int id,String urunIsmi, String uretici, String birim, int raf) {
        this.id=Islemler.id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
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
