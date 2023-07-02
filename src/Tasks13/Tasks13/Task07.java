package Tasks13.Tasks13;

public class Task07 {

    /* TASK :
     * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */
    public static void main(String[] args) {
        String[] isimler = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};

        // Dizinin 3. elemanı ile 8. elemanının yerlerini değiştirme
        String temp = isimler[2]; // 3. elemanı geçici bir değişkene kaydetme
        isimler[2] = isimler[7]; // 3. elemanın yerine 8. elemanı atama
        isimler[7] = temp; // 8. elemanın yerine geçici değişkendeki değeri atama

        // Sonucu ekrana yazdırma
        System.out.println("Dizinin 3. elemanı ile 8. elemanının yerleri değiştirildi:");
        for (String isim : isimler) {
            System.out.print(isim + " ");
        }
    }
}






