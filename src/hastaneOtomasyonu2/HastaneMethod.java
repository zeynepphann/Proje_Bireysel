package hastaneOtomasyonu2;

import java.util.Scanner;
import java.util.SplittableRandom;


import static hastaneOtomasyonu2.VeriBankasi.doktorListesiMap;
import static hastaneOtomasyonu2.VeriBankasi.hastaListesiMap;

public class HastaneMethod {
    static VeriBankasi belirti = new VeriBankasi();
    static Scanner scan = new Scanner(System.in);
    static int hastaId = 106;

    public static void giris() {
        System.out.println("************YILDIZ HASTANESI************");
        VeriBankasi.map();

        System.out.println("Kayitli hasta  :1\nYeni kayit olacak hasta :2");
        int secim = scan.nextInt();
        scan.nextLine();
        if (secim == 1) {
            idSecim();
        } else if (secim == 2) {
        yenikayit();

        } else
            System.out.println("Gecerli bir islem giriniz");


    }public static void idSecim(){

            System.out.println("Lutfen ID numaranizi giriniz ");
            hastaId = scan.nextInt();
            if (hastaListesiMap.containsKey(hastaId)) {
                belirtiler();
            } else
                System.out.println("Yanlis id girdiniz lutfen tekrar id giriniz ");
                idSecim();

    }

    private static void yenikayit() {
        System.out.println("Lutfen isim ve soy isim giriniz ");
        String isim = scan.next().toUpperCase();
        String soyIsim = scan.next().toUpperCase();
        Hasta yeniHasta = new Hasta(hastaId, isim, soyIsim);

        if (!hastaListesiMap.containsKey(hastaId)) {
            hastaId++;
            hastaListesiMap.put(hastaId, yeniHasta);
            belirtiler();
        }

    }

    public static void belirtiler() {

        hastaliklar();
        String sikayet = scan.nextLine();


        if (doktorListesiMap.containsKey(sikayet)) {
            System.out.println("Doktora yonlendiriliyorsunuz : ");

            System.out.println(hastaListesiMap.get(hastaId));
            System.out.println(doktorListesiMap.get(sikayet));

            System.out.println("Cikis icin 0'a basiniz");
            int cikis=scan.nextInt();

            if (cikis==0){
                System.out.println("Cikis yapildi");
                System.exit(0);
            }

        }else {
            System.out.println(" Hatali giris yaptiniz ");
            belirtiler();
        }


    }

    public static void hastaliklar() {
        scan.nextLine();
        System.out.println("Lutfen size uygun olan belirtiyi asagidaki gibi yaziniz :");
        System.out.println("Bas agrisi -- Alerji -- Diabet -- Soguk Alginligi -- Migren -- Kalp hastaliklari");

    }
}


