package meryem.task12;

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
        int[] arr = {3, 2, 4,6};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        // Dizinin tüm elemanlarını bir sola kaydırma işlemi
        int temp = arr[0];  // İlk elemanı geçici bir değişkene atayın
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  // Her bir elemanı bir sola kaydırın
        }
        arr[arr.length - 1] = temp;  // Geçici değişkendeki ilk elemanı sona yerleştirin
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


        }

    }
