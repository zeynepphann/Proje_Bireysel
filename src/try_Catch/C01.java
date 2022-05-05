package try_Catch;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true) {
            try {
                System.out.println("lütfen giriş yapınız");
                //giris =scan.nextInt();
                break;
            } catch (Exception e){
                scan.nextLine();
                System.out.println("Hatalı giriş yaptınız.");
            }
    }
    }
}
