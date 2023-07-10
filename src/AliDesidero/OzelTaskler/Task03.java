package AliDesidero.OzelTaskler;

public class Task03 {
    public static void main(String[] args) {

        /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden
        METHOD create ediniz.
         */
        int sayi = 7;
        String[] str = {"Selamın Aleyküm", "Aleyküm Selam"};
        enUzunHarf(sayi, str);
    }

    private static void enUzunHarf(int sayi, String[] str) {
        int enUzun = 0;
        for (String arr : str) {
            int harfler = arr.length(); // harf sayisini almak için kullanildi .

            if (harfler > enUzun) {
                enUzun = harfler; // o zaman harf sayisini güncelle

            }
        }
        int carp = sayi * enUzun; // method call edip harf sayisina carptirildi
        System.out.println("En uzun harf sayisi çarpimi : " + carp);// en son yazdirildi .

    }
}