package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        String temp = isimler[3];
        isimler[3] = isimler[8];
        isimler[8] = temp;

        System.out.println(Arrays.toString(isimler));
        ArrayList<String> isimler2 = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));




    }
}
