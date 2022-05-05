package hastaneOtomasyonu2;

import java.util.*;

public class VeriBankasi {

    int count=106;

    static Map<Integer, Hasta> hastaListesiMap = new HashMap<>();
    static Map<String, String> doktorListesiMap = new HashMap<>();
    static Set<String> doktorKeySet=doktorListesiMap.keySet();
    static List<String> keyList=new ArrayList<>();
    static List<String> doktorValueList=new ArrayList<>();
    public static void map() {
        Doktor doktor1 = new Doktor("Bas agrisi", "Norolog", "Ali", "Can");
        Doktor doktor2 = new Doktor("Alerji", "Dermatolog", "Ayse", "Yan");
        Doktor doktor3 = new Doktor("Diabet", "Genel Cerrah", "Sevgi", "Kan");
        Doktor doktor4 = new Doktor("Soguk Alginligi", "Cocuk Doktoru", "Zeynep", "Han");
        Doktor doktor5 = new Doktor("Migren", "Dahiliye", "Busra", "Boyali");
        Doktor doktor6 = new Doktor("Kalp hastaliklari", "Kardiyolog", "Nilufer", "Erdem");


        doktorListesiMap.put("Bas agrisi" , "Norolog ,Ali ,Can");
        doktorListesiMap.put("Alerji" , "Dermatolog, Ayse, Yan");
        doktorListesiMap.put("Diabet","Genel Cerrah ,Sevgi ,Kan");
        doktorListesiMap.put("Soguk Alginligi", "Cocuk Doktoru, Zeynep, Han");
        doktorListesiMap.put("Migren", "Dahiliye, Busra, Boyali");
        doktorListesiMap.put("Kalp hastaliklari", "Kardiyolog, Nilufer, Erdem");



        keyList.addAll(doktorKeySet);
        Collection<String> doktorValueColl=doktorListesiMap.values();
        //System.out.println(doktorValueColl);
        //[Kardiyolog, Nilufer, Erdem, Cocuk Doktoru, Zeynep, Han, Dermatolog, Ayse, Yan, Genel Cerrah ,Sevgi ,Kan, Norolog ,Ali ,Can, Dahiliye, Busra, Boyali]

        doktorValueList.addAll(doktorValueColl);


        int outerArrayBoyut= doktorValueList.size();
        String ilkValue=doktorValueList.get(0);
        String ikinciValue=doktorValueList.get(1);
        String ucuncuValue=doktorValueList.get(2);
        String dorduncuValue=doktorValueList.get(3);
        String besinciValue=doktorValueList.get(4);
        String altinciValue=doktorValueList.get(5);


        String ilkValueArray[]=ilkValue.split(", ");



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
       // System.out.println(hastaListesiMap.keySet());//[100, 101, 102, 103, 104, 105]

    }


}
