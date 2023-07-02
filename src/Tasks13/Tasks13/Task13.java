package Tasks13.Tasks13;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int[] originalDizi = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

        int[] ardısıkToplamDizi = ardısıkToplamDiziOluştur(originalDizi);

        System.out.print("Yeni dizi: ");
        for (int eleman : ardısıkToplamDizi) {
            System.out.print(eleman + " ");
        }
    }
    public static int[] ardısıkToplamDiziOluştur(int[] originalDizi) {
        int[] ardısıkToplamDizi = new int[originalDizi.length];
        int toplam = 0;

        for (int i = 0; i < originalDizi.length; i++) {
            toplam += originalDizi[i];
            ardısıkToplamDizi[i] = toplam;
        }

        return ardısıkToplamDizi;
    }
}