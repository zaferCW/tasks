package ahmetCakir.Task13;

import java.util.ArrayList;
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
        List<String> myList=new ArrayList<>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("Listemizin İlk hali"+myList);
        String temp=myList.get(2);
        myList.set(2,myList.get(7));
        myList.set(7,temp);
        System.out.println("Listemizin Değiştirilmiş hali = " + myList);


    }
}
