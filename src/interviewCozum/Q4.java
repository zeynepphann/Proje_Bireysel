package interviewCozum;

import java.util.Scanner;

public class Q4 {
    //Enter a positive integer to check if it is prime or not
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int sayi= scan.nextInt();

        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==i){
                System.out.println();
            }
        }

    }
}
