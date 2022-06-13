package interviewCozum;

public class Q15 {
    /*
   15.soru
   Ask user to enter the number of lines of a half pyramid.
   Type a program to create the half pyramid.
       For example if the number of lines is 5, the pyramid will be like;
                                                       *
                                                       * *
                                                       * * *
                                                       * * * *
                                                       * * * * *
   */

    public static void main(String[] args) {
        int sayi=7;

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
