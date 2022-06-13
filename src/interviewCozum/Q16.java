package interviewCozum;

public class Q16 {
    /*
16.soru
   Ask user to enter the number of lines of a inverted half pyramid.
   Type a program to create the inverted half pyramid.
    For example if the number of lines is 5, the pyramid will be like;  * * * * *
                                                      * * * *
                                                      * * *
                                                      * *
                                                      *
   */

    public static void main(String[] args) {

        int sayi=6;
        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <sayi-i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
