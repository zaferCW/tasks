package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd=new Random();
        Scanner input=  new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100)+1);
        }
        System.out.println("list = " + list);
        System.out.println("Hangi sayıyı istiyorsunuz: ");
        int istenenSayi=input.nextInt();

        boolean isValid=istenenSayiVarMi(list,istenenSayi);
        System.out.println(isValid?istenenSayi+" listte mevcut.":istenenSayi+" listte mevcut DEGİL.");

    }

    private static boolean istenenSayiVarMi(ArrayList<Integer> list,int istenenSayi) {
        for (int i = 0; i < list.size(); i++) {
            if (istenenSayi == list.get(i)) {
                return true;
            }
        }
        return false;
    }
}
