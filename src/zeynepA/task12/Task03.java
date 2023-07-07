package zeynepA.task12;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim

        int [] arr = {1,2,3,};
        System.out.println("Başlangıç Dizisi:" + Arrays.toString(arr));

        int ilkArr = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = ilkArr;

        System.out.println("Kaydırılmış Dizi:" + Arrays.toString(arr));
    }

}
