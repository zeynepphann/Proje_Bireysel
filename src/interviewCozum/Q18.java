package interviewCozum;

public class Q18 {
    /*
	18.soru
	 Ask user to enter the number of lines of a pyramide.
	  Type a program to create the pyramide.
	  For example if the number of lines is 5, the pyramide will be like;           *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
	 */

    public static void main(String[] args) {
        int sayi = 5;
        for (int i = 1; i <=sayi; i++) {

            for(int bosluk = 1; bosluk<=sayi-i; bosluk++) {
                System.out.print("  ");
            }
            for (int a= 0; a < 2*i-1 ; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
