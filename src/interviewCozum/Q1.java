package interviewCozum;

import java.util.Scanner;

public class Q1 {
    //Write a Java Program to reverse a string

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str= scan.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        System.out.println("reverse ile = " + sb.reverse());



        System.out.println("Lutfen bir kelime daha giriniz");
        String str2= scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);
        }
        System.out.println("For each ile "+ tersStr);

    }
}
