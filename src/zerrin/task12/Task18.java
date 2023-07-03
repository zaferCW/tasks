package zerrin.task12;

import java.util.ArrayList;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int yeniArr[] = new int[sayi.length];
        for (int i = 0; i < sayi.length; i++) {
            int toplam = 0;
            for (int j = 0; j < sayi[i].length; j++) {
                toplam += sayi[i][j];
            }
            yeniArr[i] = toplam;
        }

           for (int i = 0; i < yeniArr.length; i++) {
            System.out.print(yeniArr[i]);
            if (i != yeniArr.length - 1) {
                System.out.print(", ");
            }
        }
    } }