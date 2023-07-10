package MustafaAba.tasks12;

public class Task15 {
    public static void main(String[] args) {
        //task-> MDarr  tum elemalarının çarpımını print eden code create edinz
        int [][] arrMD={ {1,2,3 }, { 9,8} };

        int carpim=1;

        for (int[] kat : arrMD) {
            for (int daire : kat) {
                carpim *= daire;
            }
        }
        System.out.println("carpim = " + carpim);

    }
}
