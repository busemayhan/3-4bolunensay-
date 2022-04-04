package Giris;
import java.util.Scanner;

public class OdevBolunen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int sayac=0;
        System.out.print("sayi giriniz: ");
        k = input.nextInt();
        int total=0;
        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {

                total+=i;
                //System.out.println(i);
        sayac++;
        //System.out.println(sayac);
            }
        }

        System.out.println("ortalamasi:"+(total/sayac));
    }

}
