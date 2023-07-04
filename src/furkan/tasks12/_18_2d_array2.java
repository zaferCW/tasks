package furkan.tasks12;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.
        int toplam = 0;
        int[][] sayi = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                toplam += sayi[i][j];

            }

        }
        System.out.println("toplam = " + toplam);
    }
}