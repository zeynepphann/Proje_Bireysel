package Geometrik_Hesaplama;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cember icin : 1\n dortgen icin : 2 ");
        int secim= scan.nextInt();
        if (secim==1){
            System.out.println("Yari cap giriniz: ");
            int yariCap= scan.nextInt();
            Cember cember=new Cember(yariCap);

            cember.CemberCevreHesaplama();
            cember.CemberAlanHesaplama();

        }else if (secim==2){

            System.out.println("lutfen uzun kenari");
            double uzunKenar= scan.nextDouble();
            System.out.println("lutfen kisa kenari");
            double kisaKenar= scan.nextDouble();


            Dikdortgen dktrgn = new Dikdortgen(uzunKenar,kisaKenar);

            dktrgn.dortgenCevreHesaplama();
            dktrgn.dortgenAlanHesapla();


            Kare kare= new Kare(uzunKenar,kisaKenar);

            kare.dortgenCevreHesaplama();
            kare.dortgenAlanHesapla();


        }else{
            System.out.println(" Gecerli bir islem secmediniz");
        }





















        //dktrgn.dortgenCevreHesaplama();  static olmadigi icin obj uzerinden cagiriyoruz
        // Sekil.dortgenAlanHesapla();  static ekledigimiz icin direk class uzerinden cagirabiliyoruz

       // dktrgn.dortgenAlanHesapla();



        // kare.dortgenAlanHesapla();

        //kare.dortgenCevreHesaplama();



    }
}
