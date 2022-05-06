package hastaneOtomasyonu2;

import java.util.*;

public class VeriBankasi {



    static Map<Integer, Hasta> hastaListesiMap = new HashMap<>();
    static Map<String, Doktor> doktorListesiMap = new HashMap<>();

    public static void map() {
        Doktor doktor1 = new Doktor("Bas agrisi","Ali" , "Can", "Norolog","Acil degil");
        Doktor doktor2 = new Doktor("Alerji","Ayse" , "Yan", "Dermatolog","Acil degil");
        Doktor doktor3 = new Doktor("Diabet", "Sevgi", "Kan", "Genel Cerrah","Acil degil");
        Doktor doktor4 = new Doktor("Soguk Alginligi", "Zeynep", "Han", "Cocuk Doktoru","Acil degil");
        Doktor doktor5 = new Doktor("Migren", "Busra", "Boyali","Dahiliye" ,"Acil ");
        Doktor doktor6 = new Doktor("Kalp hastaliklari","Nilufer" , "Erdem", "Kardiyolog","Acil");


        doktorListesiMap.put("Bas agrisi" ,doktor1);
        doktorListesiMap.put("Alerji" , doktor2);
        doktorListesiMap.put("Diabet",doktor3);
        doktorListesiMap.put("Soguk Alginligi", doktor4);
        doktorListesiMap.put("Migren", doktor5);
        doktorListesiMap.put("Kalp hastaliklari", doktor6);



        Hasta hasta1 = new Hasta(100,"Veli", "Tan" );
        Hasta hasta2 = new Hasta(101,"Fatma", "Şan" );
        Hasta hasta3 = new Hasta(102,"Baris", "Savas" );
        Hasta hasta4 = new Hasta(103,"Aleyna", "Tan" );
        Hasta hasta5 = new Hasta(104,"Nisa", "Boya");
        Hasta hasta6 = new Hasta(105,"Eda", "Serdem");



        hastaListesiMap.put(100, hasta1);
        hastaListesiMap.put(101, hasta2);
        hastaListesiMap.put(102, hasta3);
        hastaListesiMap.put(103, hasta4);
        hastaListesiMap.put(104, hasta5);
        hastaListesiMap.put(105, hasta6);


    }


}
