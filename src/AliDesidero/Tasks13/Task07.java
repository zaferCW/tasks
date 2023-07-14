package AliDesidero.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {

    /* TASK :
     * 10 elamanli bir araylist olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */
    public static void main(String[] args) {
        ArrayList <String> isimler = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("öncesi = " + isimler);

        // Dizinin 3. elemanı ile 8. elemanının yerlerini değiştirme
        String temp = isimler.get(2);
        String temp2 = isimler.get(7);// 3. elemanı geçici bir değişkene kaydetme.
        isimler.set(7,temp) ; // 3. elemanın yerine 8. elemanı atama
        isimler.set(2,temp2); // 8. elemanın yerine geçici değişkendeki değeri atama..

        // Sonucu ekrana yazdırma
        System.out.println("sonrasi = " + isimler);

        //  for (String isim : isimler) {
        //    System.out.print(isim + " ");
        //}
    }
}






