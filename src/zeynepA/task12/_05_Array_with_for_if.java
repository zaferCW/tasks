package zeynepA.task12;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.


        int [] arr = {5, 6, 8, 12, 14, 19};

       int toplam =0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0){

                toplam+= arr[i];

            }else if (arr[i]%2==1){

                toplam-= arr[i];
            }
        }

        System.out.println("toplam = " + toplam);

    }
}
