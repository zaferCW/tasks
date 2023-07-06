package iclal.tasks10;

public class C01_MethodCreation_iclal3 {
    public static void main(String[] args) {
        System.out.println("Method creation başlıyor");

        toplaiclal();// method call edildi.parametresiz method
        //method call etmek için 3 yöntem vardır
        //birinci yöntem
        System.out.println("toplaiclal2(55,72) = " + toplaiclal2(55, 72));
        //ikinci yöntem
        int sonuc =toplaiclal2(33,22);
        System.out.println("sonuc = " + sonuc);
        //üçüncü yöntem
        int a=21;
        int b=34;
        System.out.println("toplaiclal2(a+b) = " +( a + b));


        toplaiclal3();
    }//main sonu

    public static void toplaiclal3(){
        int a = 55;
        int b = 9 ;
        System.out.println(a+b);
        System.out.println("toplaiclal3 methoddan sevgilerle");
        toplaiclal();//method call edildi

    }
    public static int toplaiclal2(int sayi1,int sayi2){
        int toplam= sayi1+sayi2;
        //toplaiclal(); burda hata olmaz
        return toplam;
        //toplaiclal(); yazarsak hatalı olurreturn en sonda olmalı -
    }//Missing return statement hatası olur-döndüğü değeri yazmazsak

    private static void toplaiclal() {//otomatik kendisi create etti.

        System.out.println("İlk create ettiğimiz method");
        int a=55;
        int b=44;
        System.out.println(a+b);
        System.out.println("Toplaiclal isimli method çalıştı");
    }//toplaiclal sonu
}

