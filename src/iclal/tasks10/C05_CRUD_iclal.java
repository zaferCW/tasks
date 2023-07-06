package iclal.tasks10;

import java.util.Scanner;

public class C05_CRUD_iclal {//burada method lar create edilir
    //burdaki metotlar Runner Class tan ve Switch class tan çalıştıracağız
    //burdaki metotlar ihtiyaç olduğunda istenen yerden call edilebilir
    //call edilen yede main math olmalı

    static Scanner input = new Scanner(System.in); //class level da tanımlandı
    //tüm metotlarda kullanılabilir
    static String staticUserName = "";//kullanıcıdan alınan userName'i kayıt etmek için create edildi

    public static void createUser() {
        //metoda yazarsak her metota tek tek yazmak lazım //Taha bey
        //Scanner input = new Scanner(System.in);
        System.out.println("User Name giriniz");
        String userName = input.nextLine();

        staticUserName = userName;
        //kullanıcının girdiği user name bizde static olan variable atandı


        System.out.println("create edilen userName = " + userName);
        System.out.println(userName + " isimli kullanıcı sisteme kayıt oldu");
    }

    public static void getUser() {//kullanıcı isim girmeli  ve bu isme göre kontrol yapılacak
        //kullanıcı true false dönmeli
        System.out.println("sorgulamak istediğin User Name giriniz");
        String userName = input.nextLine();


        if (userName.equals(staticUserName)) {
            System.out.println(userName + " isimli kullanıcı sistemde mevcut");
        } else System.out.println(userName + " isimli kullanıcı sistemde mevcut DEĞİL 404 not found");
    }

    public static void updateUser() {//burada kulllanici kendi ismini update edecek
        System.out.println("suan ki mevcut isminiz " + staticUserName);
        System.out.println("yeni ismini gir");

        String yeniIsim = input.nextLine();

        staticUserName = yeniIsim;

        System.out.println("isim guncelleme basarili 200 ok");
        System.out.println("yeni isminiz " + staticUserName);
    }

    public static void deleteUser() {
        System.out.println("silmek istedigin ismi gir");

        String silinecekIsim = input.nextLine();

        if (silinecekIsim.equals(staticUserName)) {//kullanicidan alinan isim esit ise sistemde kayitli olan staticUser Name e
            System.out.println(staticUserName + " isimli kullanici sistemden silindi ");
            staticUserName = null;//" " şeklinde de olabilirdi.
            System.out.println("silinen isim " + silinecekIsim);

        } else System.out.println(silinecekIsim + " isimli kullanici sistemde mevcut DEGIL 404 not found");
    }

    public static void cikis() {
        System.out.println("cikis yaptiniz yine bekleriz");
    }


}
