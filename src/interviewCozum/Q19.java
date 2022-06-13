package interviewCozum;

public class Q19 {
    /*
	19.soru
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */

    public static void main(String[] args) {
        int sayi = 5;
        for (int i =sayi; i >0; i--) {

            for(int b = 0; b<sayi-i; b++) {
                System.out.print("  ");
            }
            for (int a= 0; a <2*i-1 ; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
