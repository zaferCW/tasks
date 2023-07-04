package zeynepA.task12;

public class Task16 {
    public static void main(String[] args) {
        // task->  Mdarr'deki son elemanların çarpımını print eden code create ediniz


        int[][] MDarr = {{1, 2, 3}, {4, 5, 6,8}, {7, 8, 9, 0,2,3,2}};

        int carpim = sonElemanlarCarpimi(MDarr);

        System.out.println("Son elemanlarin carpimi = " + carpim);

    }

    private static int sonElemanlarCarpimi(int [][] MDarr) {

        int carpim=1;

        for (int i = 0; i < MDarr.length; i++) {

            carpim*=   MDarr[i][MDarr[i].length - 1];//her dairenin son elemani al

        }

        return carpim;
    }
}
