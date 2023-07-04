package furkan.tasks12;

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
        int toplam = 0;
        int[] sayi = {5, 6, 8, 12, 14, 19};
        for (int i = 0; i <sayi.length; i++) {

            if (sayi[i] % 2 == 0) {
                toplam += sayi[i];
            } else {
                toplam -= sayi[i];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
