package hasancln18.task12;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int[] arr = {2, 6, 4, 5, 8, 9};
        System.out.println("girilen degerler : ");
        cıktı(arr);
        karekok(arr);
        System.out.println("karekök degerler: ");
        cıktı(arr);

    }

    private static void karekok(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];// bu kodda kendisiyle carpimi karekökünü vericektir ..
        }

    }

    private static void cıktı(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) { // burdaki döngüde içindeki elemanin son eleman olup olmadigini kontrol eder .
                System.out.print(", "); // burda en son elemandan sonra virgül gelmemesi için yazdirilmiştir .
            }
        }
        System.out.println(); // dummy
    }
}
