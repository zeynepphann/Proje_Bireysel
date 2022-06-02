package interviewCozum;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    /*
  Ask user to enter 2 Strings.
  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
  Otherwise, print "Not Anagram" on the console.
  Ignore cases.
  For example; "Mary" and "army" and "RAMY" are Anagrams.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 String giriniz");
        String str1 = scan.next().toLowerCase();
        String str2 = scan.next().toLowerCase();

        String arr1[] = str1.split("");
        Arrays.sort(arr1);


        String arr2[] = str2.split("");
        Arrays.sort(arr2);

        if (Arrays.equals(arr2, arr1)) {

            System.out.println("Girdiginiz 2 string Anagromdir");

        } else {
            System.out.println("Girdiginiz 2 string Anagrom degildir ");
        }

    }
}
