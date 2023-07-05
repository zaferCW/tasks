package zeynepA.tasks10;

import java.util.Scanner;

    public class Task06 {

        static Scanner input = new Scanner(System.in);//her yerden ulaşılabilmesi için

        public static void main(String[] args) {

            //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz

            geometrikHesapla();


        }//main sonu

        private static void geometrikHesapla() {


            System.out.print("1. sayıyı giriniz : ");

            double sayi1 = input.nextDouble();

            System.out.print("2. sayıyı giriniz : ");

            double sayi2 = input.nextDouble();

            System.out.print("geometrik şekil seçiminizi giriniz : ");

            String  geoSekil = input.next().toLowerCase();

            switch (geoSekil) {

                case "kare":

                    kareAlanHesapla(sayi1);
                    kareCevreHesapla(sayi1);

                    break;

                case "dikdortgen":

                    dikdortgenAlanHesapla(sayi1, sayi2);
                    dikdortgenCevreHesapla(sayi1, sayi2);

                    break;

                case "ucgen":

                    ucgenAlanHesapla(sayi1);
                    ucgenCevreHesapla(sayi1, sayi2);

                    break;

                default:

                    System.out.println("hatalı giriş yaptınız ");
            }

        }

        private static void ucgenCevreHesapla(double sayi1, double sayi2) {

            System.out.print("3. kenarı giriniz  : ");

            double kenar3=input.nextDouble();

            System.out.println("ucgenin cevresi : "+(sayi1+sayi2+kenar3));
        }

        private static void ucgenAlanHesapla(double sayi1) {

            System.out.print("yukseklik giriniz  : ");

            double yksklk=input.nextDouble();

            System.out.println("ucgenin alanı : "+((sayi1*yksklk)/2));

        }

        private static void dikdortgenCevreHesapla(double sayi1, double sayi2) {

            System.out.println("dikdortgenin cevresi :"+((sayi1+sayi2)*2));
        }

        private static void dikdortgenAlanHesapla(double sayi1, double sayi2) {

            System.out.println("dikdortgenin  alanı :"+(sayi1*sayi2));
        }

        private static void kareCevreHesapla(double sayi1) {
            System.out.println("karenin cevresi :"+(sayi1*4));
        }

        private static void kareAlanHesapla(double sayi1) {

            System.out.println("karenin alanı :"+(sayi1*sayi1));

        }


    }