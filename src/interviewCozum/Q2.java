package interviewCozum;

import java.util.Scanner;

public class Q2 {
    //Write a Java Program to swap two numbers
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int temp=0;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println(sayi1+" "+sayi2);


    }
}
