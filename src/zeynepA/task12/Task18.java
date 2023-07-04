package zeynepA.task12;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {

        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}


        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int [] yeniArr = icArrToplami(sayi);


        System.out.println("iç array toplamlarından oluşturulan yeniArr :" + Arrays.toString(yeniArr));

    }

    private static int[] icArrToplami(int [][] sayi) {

        int [] yeniArr = new int [sayi.length];

        for (int i = 0; i < sayi.length; i++) {

            int toplam =0;

            for (int j = 0; j < sayi[i].length; j++) {

                toplam+= sayi[i][j];

            }
            yeniArr[i]= toplam;
        }
            return yeniArr;
    }
}
