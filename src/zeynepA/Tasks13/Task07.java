package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> names = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));


        String ucuncuElement= names.get(2);
        String sekizinciElement = names.get(7);

        names.set(2, sekizinciElement);
        names.set(7, ucuncuElement);

        System.out.println("names = " + names);
    }
}
