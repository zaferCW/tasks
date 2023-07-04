package zeynepA.task12;

public class Task17 {

    public static void main(String[] args) {

        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...


        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24

        int enBuyuk = enBuyukEleman(sayi);

        System.out.println("Array in en büyük elemani = " + enBuyuk);

    }

    private static int enBuyukEleman(int [][] sayi) {

        int enBuyuk =Integer.MIN_VALUE;

        for (int i = 0; i < sayi.length; i++) {

            for (int j = 0; j < sayi[i].length; j++) {

                if (sayi[i][j]> enBuyuk){

                    enBuyuk= sayi[i][j];
                }

            }

        }

        return enBuyuk;

    }
}
