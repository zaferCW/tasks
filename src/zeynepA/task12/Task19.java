package zeynepA.task12;

public class Task19 {
    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        
        int arr1[][]={ {1,2}, {3,4,5}, {6} };
        
        int arr2[][]={ {7,8,9}, {10,11}, {12} };
        
        ayniIndexArrToplami(arr1, arr2);
        
    }

    private static void ayniIndexArrToplami(int [][] arr1, int [][] arr2) {
        int enKucukLength = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < enKucukLength; i++) {
            int toplam =0;

            for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {

                toplam+= arr1[i][j] + arr2[i][j];

            }

            System.out.println(i + " . index'teki elemanların toplamı = " + toplam);
        }

    }
}
