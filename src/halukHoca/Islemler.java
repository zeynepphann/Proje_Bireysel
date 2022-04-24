package halukHoca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static Scanner scan = new Scanner(System.in);
    public static int id=1000;

    static List<Integer> idDepo=new ArrayList<>();
    static List<DepoYonetimi>  depo = new ArrayList<>();
    static HashMap <Integer,DepoYonetimi> urunlerMap = new HashMap<>();
    public static int raf=0;

    public static void baslangic(){
        System.out.println("Yapmak istediginiz islemi seciniz :\n"+
                "Urun Tanimlama icin 1\n" +
                "Urun Listeme icin 2\n" +
                "Urun Girisi icin 3\n" +
                "Urunu Rafa koymak icin 4\n" +
                "Urun Cikisi icin 5\n"+
                "Butun islemleri bitirmek icin 0'a basiniz");
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
                cikis();
                break;

            default:
                System.out.println("Hatali bir giris yaptiniz...");
                baslangic();
                break;
        }




    }

    private static void cikis() {

        System.out.println("Cikis yaptiniz");
    }

    private static void urunCikisi() {

        urunListele();
        System.out.println("Cikis yapmak istediginiz urunun id'sini giriniz :");
        int cikisId= scan.nextInt();
        for (DepoYonetimi each: depo
             ) {
            if (each.getId()==cikisId){
                System.out.println("Cikilacak urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>=0 && kacMiktar<=each.getMiktar()){
                each.setMiktar(each.getMiktar()-kacMiktar);
                    System.out.println("Suan ki toplam urun miktari : "+ each.getMiktar());
                }else  System.out.println(" Yeterli urun olmadigi icin cikis yapilamadi. ");

            }else {
                System.out.println("Gecerli bir id giriniz :");
                urunCikisi();
            }
        }
    }

    public static void urunuRafaKoy() {


            boolean rafaKoyduMu=false;
            urunListele();
            System.out.println("Lutfen urun listesinden gecerli bir id giriniz: ");
            int girisId= scan.nextInt();

            for (DepoYonetimi each : depo
            ) {
                if (each.getId()==girisId){
                    System.out.println("Urunu koymak istediginiz rafi seciniz ");
                    each.setRaf(scan.nextInt());
                    urunListele();
                } else {
                    System.out.println("Urun bulunamadigi icin rafa kaldirilmadi");
                    urunuRafaKoy();
                }
            }


            baslangic();
    }




    public static void urunGirisi() {


        System.out.println("Giris yapmak istediginiz urunun id'sini giriniz :");
        int girisId=scan.nextInt();
        for (DepoYonetimi each : depo
             ) {
            if (each.getId()==girisId){
                System.out.println("Girilecek urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0){
                  each.setMiktar(each.getMiktar()+kacMiktar);
                    System.out.println("Suanki urun miktari : "+ each.getMiktar());
                }else System.out.println("Gecerli bir miktar giriniz. ");


            }else{
                System.out.println("Gecerli bir id girin : ");
                urunGirisi();

            }

        }

    }

      public static  void urunListele() {
        System.out.println("id     Urun İsmi     Uretici      Miktari        Birimi     Raf");
        System.out.println("********************************************************************");
        for (int i = 0; i < depo.size() ; i++) {
            System.out.printf("%-3d    %-9s     %-9s      %3d           %-7s   Raf%2d  \n",
                    depo.get(i).getId(),depo.get(i).getUrunIsmi(),depo.get(i).getUretici(),
                    depo.get(i).getMiktar(),depo.get(i).getBirim(),depo.get(i).getRaf());
        }
        scan.nextLine();
        System.out.println("********************************************************************");
    }


       public static void uruntanimlama() {

            System.out.print(" Urun tanimlamak icin ;\n urunun ismi :");
            scan.nextLine();
            String urunAdi = scan.nextLine();

            System.out.print("urunun ureticisi : ");
            String uretici = scan.nextLine();

            System.out.print("urunun birimi : ");
            String birim = scan.nextLine();

            System.out.print("urunun miktari : ");
            int miktar = scan.nextInt();


            DepoYonetimi obj = new DepoYonetimi(id,urunAdi,uretici,miktar,birim,raf);
            depo.add(obj);
            urunlerMap.put(id,obj);
            id++;

            System.out.println("\n");
            baslangic();






    }

}