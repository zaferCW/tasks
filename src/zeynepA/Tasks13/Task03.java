package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,25,3,4,55,34,65,69,12,5,7,6,9,10));

        Scanner input =new Scanner(System.in);
        System.out.println("Listte hangi sayıyı aramak istersiniz");
        int arananSayi= input.nextInt();

        boolean sayiVarmi= sayiKontrol(numList,arananSayi);

        if (sayiVarmi){
            System.out.println("Sayi Listte VAR");
        }else {
            System.out.println("Sayi Listte YOK");
        }
    }

    private static boolean sayiKontrol(ArrayList<Integer> numList, int arananSayi) {

        return numList.contains(arananSayi);
    }
}
