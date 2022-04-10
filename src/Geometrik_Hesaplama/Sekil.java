package Geometrik_Hesaplama;

public class Sekil {

    protected double yariCap;
    protected double kisaKenar;
    protected double uzunKenar;
    protected double pi=3.14;

    Sekil(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
    protected Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    protected void cemberAlanHesapla(){
        double cemberAlan=pi*(yariCap*yariCap);
        System.out.println("Cember alan : "+ cemberAlan);
    }
    protected void cemberCevreHesapla(){
        double cemberCevre=2*(pi*yariCap);
        System.out.println("Cember alan : "+ cemberCevre);
    }
    protected void dortgenAlanHesapla(){

        if (uzunKenar==kisaKenar){
            System.out.println("Kare alan: "+kisaKenar*uzunKenar );
        }else{
            System.out.println("Dikdortgen alan: "+kisaKenar*uzunKenar);
        }


    }
    protected void dortgenCevreHesaplama(){
        double dortgenCevre=2*(kisaKenar+uzunKenar);

        if (uzunKenar==kisaKenar){
            System.out.println("Kare Cevre: " +dortgenCevre);
        }else{
            System.out.println("Dikdortgen Cevre: " + dortgenCevre);
        }
    }


}
