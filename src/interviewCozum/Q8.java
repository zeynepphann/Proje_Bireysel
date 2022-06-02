package interviewCozum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q8 {
    /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen listeye eklemek istedigin kadar eleman ekleyin eger ekleme istemini durdurmak isterseniz 0'a basin ");

        String girilen= scanner.next();

        Set<String > tekrarsizList= new HashSet<>();
        tekrarsizList.add(girilen);

        while (!girilen.contains("0")){
            System.out.println("bir karakter giriniz");
            String girilen2=scanner.next();

               if (!girilen2.equals("0")){
                   tekrarsizList.add(girilen2);
               }
               if (girilen2.contains("0")){
                   System.out.println("Listeniz : "+ tekrarsizList);
                   break;
               }


        }

     }

    }

