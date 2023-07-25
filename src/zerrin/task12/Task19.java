package zerrin.task12;

public class Task19 {
    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][]={ {1,2}, {3,4,5}, {6} };
        int arr2[][]={ {7,8,9}, {10,11}, {12} };

        int satir=Math.min(arr1.length,arr2.length);
        for (int i = 0; i < satir; i++) {
            int[] icArr1=arr1[i];
            int[] icArr2=arr2[i];

        int kolon=Math.min(icArr1.length,icArr2.length);
            int sum=0;
            for (int j = 0; j < kolon; j++) {
                sum+=icArr1[j]+icArr2[j];
            }
            System.out.println("toplam="+(i+1)+".eleman:"+sum);



        }



    }
}
