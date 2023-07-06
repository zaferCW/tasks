package iclal.tasks10;

public class C04_MethodOverloading_iclal {
    public static void main(String[] args) {
        /*

               Java'da  methodlarin farkli olup olmadiklarini  icin
                    a)Method ismi  b)parametreler kontrol edilir..

               Java da ayni isimle birden fazla method olusturulmasına overloading denir.
               Overloading icin Method Signature'larinin farkli olmasi gerekir
               Method Signature = isim + parametre sayisi + parametre data type

             TRICK_01 : Access Modifier'lari degistirmek de method'lari Java  farkli methodlar olarak
              derlemez
               aynı method olarak derler   Cunku access modifier'lar method signature'a dahil degildir.

              TRICK_02 : Method'larin body'sini degistirmek de method'lari Java  farkli methodlar
              olarak derlemez
               aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.

              TRICK_03 : Overloading "Compile Time Error" verir.

              Overloading :
              1)Parametrelerin sayisini degistirerek ayni isimli method'lar olusturabilirsiniz.
              2)Parametre sayisini degistirmeden herhangi bir parametrenin data type'ini
                degistirerek de ayni isimli methodlar olusturabilirsiniz.
              Note: topla(2,3); cagrisi topla(double num1, int num2) var oldugu surece
                    topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
                    data type birebir ortusuyor. Fakat birebir ortusen data type yoksa auto widening'e
                    gore Java kullanacagi method'u secer. Auto widening'e gore kullanabilecegi bir method
                    yoksa Java hata verir.
              3)FARKLI data type'indeki parametrelerin yerlerini degistirerek de ayni isimli
                methodlar olusturabilirsiniz.
               birbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir
               (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
               methodu kullanir)
               Eger kapsayan bir method da bulamazsa Java CTE verir

            */
        String str = "tam oturmasi icin birkac ornek daha gerekir";
        System.out.println("str.indexOf(o) = " + str.indexOf("o"));

        // output :-1 - bulamayınca -1 verir
        System.out.println("str.indexOf(25) = " + str.indexOf(25));
        //overload edilmiş bir metodu kullandık


        System.out.println("Overloading");

        //metot isimleri aynı ama parametreleri farklı

       // toplaiclalyeni();
       //toplaiclalyeni(1, 5);
       // toplaiclalyeni(1, 2, 4);

        System.out.println("toplaiclalyeni(1, 2, 4) = " + toplaiclalyeni(1, 2, 4));
        System.out.println("toplaiclalyeni('a', 'b', 'c') = " + toplaiclalyeni('a', 'b', 'c'));

        System.out.println("toplaiclalyeni(1, 5.2) = " + toplaiclalyeni(1, 5.2));

    }

    private static double toplaiclalyeni(int i, double v) {
        return i+v;
    }

    private static int toplaiclalyeni(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static int toplaiclalyeni(int i, int i1) {
        return i + i1;
    }

    private static int toplaiclalyeni() {
        int a=2;
        int b=3;
        int sonuc = (a + b);
        System.out.println("(a+b) = " + sonuc);
        return sonuc;
    }
}
