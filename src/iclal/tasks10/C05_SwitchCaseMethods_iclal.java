package iclal.tasks10;


import ch10_MethodCreation.C05_CRUD_iclal;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD_iclal.createUser;

public class C05_SwitchCaseMethods_iclal {
    public static void menu() {
        System.out.println("sistemimize hosgeldin");
        System.out.println("uygulamaya kayit olmak icin 1  \nkullanici sorgulamak icin 2  \n" +
                "kullanici bilgi guncelleme icin 3   \nkullanici silme icin 4  \ncikis islemler icin 5 e basiniz");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();
        switch (secim) {
            case 1:
                createUser();   // bu metot başka bir class ta buraya alayım mı diye sorar
                //otomatik yukarda import edilir
                menu(); // metodu tekrar call ettik. kayıttan sonra menu() metodundan çıkmasın diye
                //tekrar menu() metodunu çağırdık.
                break;
            case 2:
                ch10_MethodCreation.C05_CRUD_iclal.getUser(); //static le de çağırılır yukarıdaki gibi kendi ismiyle de çağırılır.
                menu();
                break;
            case 3:
                ch10_MethodCreation.C05_CRUD_iclal.updateUser();
                menu();
                break;
            case 4:
                ch10_MethodCreation.C05_CRUD_iclal.deleteUser();
                menu();
                break;
            case 5:
                C05_CRUD_iclal.cikis();
                menu();
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız!!");
                menu();
                break;

        }

    }

}
