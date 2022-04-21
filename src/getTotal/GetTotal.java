package getTotal;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class GetTotal {
    public static void main(String[] args) {
        /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
     */
        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];



        int sayi1=Integer.parseInt(num1.replaceAll("\\D",""));
        int sayi2=Integer.parseInt(num2.replaceAll("\\D",""));
        int sayi3=Integer.parseInt(num3.replaceAll("\\D",""));

        int sonuc=sayi1+sayi2+sayi3;
        System.out.println(sonuc);








    }

}
