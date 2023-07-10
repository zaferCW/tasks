package MustafaAba.tasks12;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...
        int[][] sayi ={{1,2,3},{19,-8},{24,10,-41}};//24

        int max=sayi[0][0];

        for (int[] kat : sayi) {
            for (int daire : kat) {
                if (max < daire) {
                    max = daire;
                }
            }
        }
        System.out.println("max eleman= " + max);

    }
}
