package furkan.tasks12;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        int  [][] sayi={{2,3,2},{4,1,5},{7,2,5}};
        System.out.println("Arrays.deepToString(sayi) = " + Arrays.deepToString(sayi));

        degerDegis(sayi,2,6);

        System.out.println("Arrays.deepToString(sayi) = " + Arrays.deepToString(sayi));




    }

    private static void degerDegis(int [][] dizi,int eskiDeger,int yeniDeger) {
        for (int i = 0; i <dizi.length; i++) {
            for (int j = 0; j <dizi[i].length; j++) {
                if (dizi[i][j]==eskiDeger){
                    dizi[i][j]=yeniDeger;
                }

            }


        }
    }
}