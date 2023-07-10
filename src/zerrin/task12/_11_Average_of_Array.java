package zerrin.task12;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int [] array ={12, 14 , 21 ,23 , 10 ,4,5};
        int toplam=0;


        for (int i = 0; i < array.length; i++) {
            toplam +=array[i];

        }
        System.out.println("toplam = " + toplam);
        double ortalama=(double) toplam/array.length;
        System.out.println("ortalama = " + ortalama);
    }
}