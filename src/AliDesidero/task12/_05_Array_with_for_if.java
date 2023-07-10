package AliDesidero.task12;

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
        int[] numbers = {-5, 6, 8, 12, 14, -19};
        int toplam = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                toplam += numbers[i];
            } else {
                toplam -= numbers[i];
            }
        }
        System.out.println("Toplam: " + toplam);

    }
}
