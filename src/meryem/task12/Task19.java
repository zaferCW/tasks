package meryem.task12;

public class Task19 {
    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
      //  int sum = 0;
        int satirsayisi = Math.min(arr1.length, arr2.length);//satirsayisi = 3
        System.out.println("satirsayisi = " + satirsayisi);
        int maxCol = 0;
        for (int i = 0; i < satirsayisi; i++) {//maxCol = 2

            maxCol = Math.max(maxCol, Math.min(arr1[i].length, arr2[i].length));
        }
        System.out.println("maxCol = " + maxCol);//maxCol = 2

        // Elemanları toplama ve ekrana yazdırma
        for (int i = 0; i < satirsayisi; i++) {//satirsayisi = 3
            int sum = 0;
            for (int j = 0; j < maxCol; j++) {//maxCol = 2
                if (j < arr1[i].length && j < arr2[i].length) {
                    sum += arr1[i][j] + arr2[i][j];
                } else if (j < arr1[i].length) {
                    sum += arr1[i][j];
                } else if (j < arr2[i].length) {
                    sum += arr2[i][j];
                }
                System.out.println("Index " + i + " toplamı: " + sum);
            }
            System.out.println("Index " + i + " toplamı: " + sum);//Index 0 toplamı: 18, Index 1 toplamı: 28 , Index 2 toplamı: 18


        }
    }
}
