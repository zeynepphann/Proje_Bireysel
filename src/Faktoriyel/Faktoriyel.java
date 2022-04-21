package Faktoriyel;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
         /*
      Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen faktorielini bulmak istediginiz sayiyi giriniz: ");
        int sayi= scan.nextInt();
        int faktoriel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriel*=i;

        }
        System.out.println("Girdiginiz sayinin faktorieli: " + faktoriel);
     */


        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

        int faktoriel=1;

        for (int i = 0; i <=number ; i--) {
            faktoriel*=i;

        }
        System.out.println("Girdiginiz sayinin faktorieli: " + faktoriel);
    }


}
