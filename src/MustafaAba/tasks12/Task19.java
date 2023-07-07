package MustafaAba.tasks12;

public class Task19 {
    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};

        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            if (arr1[i].length > arr2[i].length) {
                for (int j = 0; j < arr2[i].length; j++) {
                        sum += arr1[i][j]+arr2[i][j];
                }
            } else if(arr1[i].length <= arr2[i].length) {
                for (int j = 0; j < arr1[i].length; j++) {
                    sum += arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("sum = " + sum);
        }
        System.out.println(sum);
    }
}
