package Rumeysa.task26.task06;

import java.util.Random;

public class Task06_a {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.




        randomSayi();

    }

    private static void randomSayi() {
        Random random = new Random(3);
        System.out.println("random = " + random);
    }


}
