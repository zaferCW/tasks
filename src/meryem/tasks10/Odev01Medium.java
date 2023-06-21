package meryem.tasks10;

public class Odev01Medium {
    /*
     Ismi randomNum olan bir method oluşturun.
     Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
   Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */


    public static void main(String[] args) {
        int max = 100;

        System.out.println("randomNum(max) = " + randomNum(max));

    }//main sonu

    private static int randomNum(int x) {
        int random= (int) (Math.random()*x);


        return random;

    }
}//classs sonu
