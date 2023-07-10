package AliDesidero.OzelTaskler;

public class T10_ArrayList {
    public static void main(String[] args) {
        /* Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
     Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)
     */
        int[] arr = {15, 31, 8, 13, 12};

        System.out.println("değişmeden önceki hali : " );
        for (int sayi : arr) {
            System.out.print(sayi + " ");
        }

        System.out.println("\ndeğişmeden sonraki hali : " );
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 8 && arr[i] != 12) { // sayi 8 veya 12 degilse ?
                arr[i] += 2; // o sayilari bul ve 2şer artir
            }
        }
        for (int sayi : arr) {
            System.out.print(sayi + " ");

        }
    }
}