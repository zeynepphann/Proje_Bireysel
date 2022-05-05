package hastaneOtomasyonu2;

import java.util.Scanner;
import java.util.SplittableRandom;

public class HastaneMethod {
   static VeriBankasi belirti = new VeriBankasi();
   static Scanner scan= new Scanner(System.in);
   static int hastaId=106;

   public static void giris(){

       VeriBankasi.map();
       System.out.println("************YILDIZ HASTANESI************");
       System.out.println("Kayitli hasta  :1\n Yeni kayit olacak hasta 2:");
       int secim= scan.nextInt();
       scan.nextLine();

       if (secim==1){
           System.out.println("Lutfen ID numaranizi giriniz ");
           hastaId=scan.nextInt();

           if (VeriBankasi.hastaListesiMap.containsKey(hastaId)){
               belirtiler();
           }else
               System.out.println("yanlis id girdiniz");

       }else if (secim==2){
           yenikayit();
       }



   }

    private static void yenikayit() {
    }

    public static void belirtiler() {


        System.out.println("Lutfen sikayetinizi yaziniz");
        scan.nextLine();
        String sikayet = scan.nextLine();


        if (VeriBankasi.keyList.contains(sikayet)) {
            System.out.println("Aciliyet gerektiren bir durum yok");
            System.out.println(VeriBankasi.doktorValueList.get(2));

        }else if (sikayet.equals("Bas Agrisi")) {
            System.out.println("Aciliyet gerektiren bir durum yok");
        } else if (sikayet.equals("Diabet")) {
            System.out.println("Aciliyet gerektiren bir durum yok");
        }else if (sikayet.equals("Soguk ALginligi")) {
            System.out.println("Aciliyet gerektiren bir durum yok");
        }else if (sikayet.equals("Migren")) {
            System.out.println("Hemen bir doktora yonlendiriliyorsunuz ");
        }else if (sikayet.equals("Kalp Hastaliklari")){
            System.out.println("Hemen bir doktora yonlendiriliyorsunuz");
        }

    }

}


