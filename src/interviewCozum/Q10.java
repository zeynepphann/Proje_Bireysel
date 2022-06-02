package interviewCozum;

import java.util.Arrays;

public class Q10 {
    /*
  Count the words in a String one by one
  String is "Ali came to school and Ayse came to school"
  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
    */
    public static void main(String[] args) {

        String cumle="Ali came to school and Ayse came to school";

        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr));

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               if (arr[i].equals(arr[j])){
                   sayac++;

               }
            }
            System.out.println(arr[i]+sayac);
        }


    }
}
