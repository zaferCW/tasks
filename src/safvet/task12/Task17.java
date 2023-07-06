package safvet.task12;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};//24
        int buyukSayi = buyukSayıBul(sayi);
        System.out.println("En büyük eleman : " + buyukSayi);
    }

    private static int buyukSayıBul(int[][] sayi) {
        int buyukSayi = Integer.MIN_VALUE;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j] > buyukSayi) {
                    buyukSayi = sayi[i][j];
                }
            }
        }
        return buyukSayi;
    }
}






