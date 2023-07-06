package safvet.task12;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
                    // arraydeki her bir elemani index degeri kadar artiralim
        int [] arr = {1,2,3} ;
        int lenght = arr.length ;

        // Dizideki tüm elemanlarin bir sola kaydirilmasi durumu ...
        int temp= arr[0];
        for (int i = 0; i <lenght-1 ; i++) {
            arr[i] = arr[i+1]; // her elemanin bir sola kaydirilmasi ..
        }
        arr [lenght-1]=temp; // geçici değişkende sakladıgımız ilk elemani sona yerleştirelim..

        // kaydirilmiş diziyi yazdirma
        System.out.println(java.util.Arrays.toString(arr));





    }

}
