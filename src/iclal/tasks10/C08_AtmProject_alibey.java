package iclal.tasks10;

import java.util.Scanner;

//import static ch10_MethodCreation.C05_CRUD.cıkıs;

public class C08_AtmProject_alibey {
    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 3; // kullanici şifre girme hakki için create edildi.

    public static void main(String[] args) {
        // basit bir atm programi yaziniz .
        // switch case , method creation , ve diğer konulari kullanarak yaziniz .
        sifreKontrol();
    }

    private static void sifreKontrol() {
        System.out.println("******************");
        System.out.println("***** bankamiza hosgeldiniz *****");
        System.out.println("hosgeldiniz sifrenizi giriniz : ");

        String sifre = input.nextLine();

        while (count > 0) {
            if (sifre.equals(password)) {
                anaMenu(); // sifre dogru ise ana menuye yonlendirir .
                break;
            } else {
                System.out.println("sifre eslesmedi tekrar deneyiniz :");
                sifre = input.nextLine();
                count--;
                if (count == 0) {
                    System.out.println("Kart bloke oldu");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulama için 1 \npara yatirma için 2 \n para cekme için 3 \ncıkıs için 4e basiniz :");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                bakiyesorgula();
                anaMenu();
                break;
            case 2:
                paraYatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4:
                cıkıs1();
                break;
            default:
                System.out.println("hatali seçim yaptiniz tekrar deneyiniz ");
                anaMenu();
                break;
        }
    }

    private static void cıkıs1() {
        System.out.println("iyi günler tekrar görüşmek üzere");
    }

    private static void paraCekme() {
        System.out.println("ne kadar para çekmek istersiniz : ");
        int cekilenPara = input.nextInt();
        if (bakiye >= cekilenPara) {
            bakiye -= cekilenPara;
            System.out.println("güncel bakiyeniz : " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye tekrar deneyiniz . ");
            System.out.println("tekrar denemek için 1 e \nana menuye donmek için 2 ye basiniz : ");
            int tercih = input.nextInt();
            do {
                switch (tercih) {
                    case 1:
                        paraCekme();
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("yanlis tercih yaptiniz lütfen tekrar deneyiniz .");
                        System.out.println("tekrar denemek için 1 e \nana menuye donmek için 2 ye basiniz : ");
                        tercih = input.nextInt();
                        if (tercih == 1) {
                            paraCekme();
                        }else if (tercih==2)
                            break;
                        }
                }
                while (!(tercih == 1 || tercih == 2)) ;
            }
        }

        private static void paraYatir () {
            System.out.println("ne kadar para yatirmak istersiniz : ");
            double girilenPara = input.nextDouble();
            bakiye += girilenPara;
            System.out.println("bakiye = " + bakiye);
        }

        private static void bakiyesorgula () {
            System.out.println("bakiye = " + bakiye);
        }
    }





