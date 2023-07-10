package zeynepA.task12;

public class Task15 {
    public static void main(String[] args) {

        //task-> MDarr  tum elemalarının çarpımını print eden code create edinz

        int [][] arrMD={ {1,2,3 }, { 9,8} };

        int carpim= elemanlarCarpimi(arrMD);

        System.out.println("carpim = " + carpim);


    }

    private static int elemanlarCarpimi(int [][] arrMD) {
        int carpim=1;

        for (int i = 0; i <arrMD.length ; i++) {

        for (int j = 0; j < arrMD[i].length ; j++) {

            carpim*=arrMD[i][j];
        }
    }
       return carpim;

    }
}
