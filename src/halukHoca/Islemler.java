package halukHoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static Scanner scan = new Scanner(System.in);

    public static List<DepoYonetimi> urunlerListesi = new ArrayList<>();
    public static void baslangic(){
        System.out.println("Yapmak istediginiz islemi seciniz :\n"+
                "Urun tanimlama icin 1\n" +
                "Urun listeme icin 2\n" +
                "Urun Girisi icin 3\n" +
                "Urunu rafa koyak icin 4\n" +
                "Urun cikisi icin 5'i tuslayiniz");
        int tercih= scan.nextInt();
        switch (tercih){
            case 1:
                uruntanimlama();
                baslangic();
                break;
            case 2:
                urunListele();
                baslangic();
                break;
            case 3:
                urunGirisi();
                baslangic();
                break;
            case 4:
                urunuRafaKoy();
                baslangic();
                break;
            case 5:
                urunCikisi();
                baslangic();
                break;

            case 0:
               // cikis();
                break;

            default:
                System.out.println("Hatali yaptiniz...");
                baslangic();
        }




    }

    private static void urunCikisi() {
        boolean cikisDogruMu=false;
        urunListele();
        System.out.println("Cikis yapmak istediginiz urunun id'sini giriniz :");
        int cikisId= scan.nextInt();
        for (DepoYonetimi each:urunlerListesi
             ) {
            if (each.id==cikisId){
                System.out.println("Cikilacak urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0){
                    each.miktar+=kacMiktar;

                }else System.out.println("gecerli bir miktar giriniz. ");
                cikisDogruMu=true;
                break;
            }
        }
    }

    public static void urunuRafaKoy() {
        urunListele();
        System.out.println("Lutfen urun listesinden gecerli bir id giriniz: ");
        int girisId= scan.nextInt();
        for (DepoYonetimi each : urunlerListesi
             ) {
            if (DepoYonetimi.id==girisId){
                System.out.println("Urunu koymak istediginiz rafi seciniz ");
               DepoYonetimi.raf= Integer.parseInt("Raf"+scan.next());
               break;
            }
        }


    }

    public static void urunGirisi() {

        boolean sonuc=false;
        System.out.println("giris yapmak istediginiz urunun id'sini giriniz :");
        int girisId=scan.nextInt();
        for (DepoYonetimi each : urunlerListesi
             ) {
            if (each.id==girisId){
                System.out.println("Girilecek urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0){
                    each.miktar+=kacMiktar;

                }else System.out.println("gecerli bir miktar giriniz. ");
               sonuc=true;
               break;
            }
        }

    }

      public static  void urunListele() {
        System.out.println("  id     Urun İsmi      Uretici    Miktari     Birimi     Raf");
        System.out.println("***************************************************************");
        for (int i = 0; i < urunlerListesi.size() ; i++) {
            System.out.printf("%-3d    %-10s       %-10s        %3d        %-10s     %3d  \n",
                    urunlerListesi.get(i).id,urunlerListesi.get(i).urunIsmi,urunlerListesi.get(i).uretici,
                    urunlerListesi.get(i).miktar,urunlerListesi.get(i).birim,urunlerListesi.get(i).raf);
        }
        scan.nextLine();
        System.out.println("***************************************************************");
    }


    public static List<DepoYonetimi>  uruntanimlama() {
        boolean flag = true;

        do {
            System.out.print(" Urun tanimlamak icin ;\n urunun ismi :");
            scan.nextLine();
            String urunAdi = scan.nextLine();

            System.out.print("urunun ureticisi : ");
            String uretici = scan.nextLine();

            System.out.print("urunun birimi : ");
            String birim = scan.nextLine();

            System.out.print("urunun ureticisi : ");
            int girisid= scan.nextInt();


            DepoYonetimi obj = new DepoYonetimi(urunAdi,uretici,birim,girisid);
            urunlerListesi.add(obj);
            DepoYonetimi.id++;
            System.out.println("Urun girisini bitirmek istiyorsaniz 0'a basiniz ");
            int cikis=scan.nextInt();
            if (cikis==0){
                System.out.println("Cikis yaptiniz.");
            }

        } while (flag == true);

        return urunlerListesi;
    }

}