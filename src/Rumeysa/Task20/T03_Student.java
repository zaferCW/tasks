package Rumeysa.Task20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T03_Student {
    /*fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
    derslerin toplam kredi miktarını return eden  toplamKredisi method */
    public static ArrayList<T03_Lesson> asilDersList = new ArrayList<T03_Lesson>();
    // dersleri sakladigimiz liste
    public static ArrayList<T03_Lesson> secilenDersler = new ArrayList<T03_Lesson>();
    static Scanner input = new Scanner(System.in);
    String studentName;
    int maxCredit = 10;


    public T03_Student() {//cons
    }


    public T03_Student(String studentName) {//cons
        this.studentName = studentName;

    }

    public int toplamKredisi() {
        int toplam = 0;
        for (T03_Lesson each : asilDersList) {
            toplam += each.credit;
        }
        return toplam;
    }
        public void ogrenciTercih () {//meth
            boolean dongu = true;
            int sum = 0;
            int x = 1;
            while (dongu) {
                System.out.println("ders seciniz");
                for (T03_Lesson each : asilDersList) { // dersleri gormek icin
                    System.out.println(x + ". - " + each.name + " " + each.credit);
                    x++;
                    if (x == 4)
                        x = 1;
                }
                int secim = input.nextInt(); // ders secimi yaptigimiz
                if (secim < 1 || secim > asilDersList.size()) {
                    System.out.println("Geçersiz ders seçimi.");
                    continue; // gecersiz deger girildiginde continue ile basa doner
                }T03_Lesson secilenDers = asilDersList.get(secim - 1);//T03_Lesson turunde bir variable

                //System.out.println("Arrays.toString(secilenDers) = " + Arrays.toString(secilenDers));
                //no suitable method found for toString

                if (sum + secilenDers.credit <= maxCredit) {//once yapilan tercihin toplamini kontrol ediyor

                    secilenDersler.add(secilenDers);
                    sum += secilenDers.credit;
                } else {
                    System.out.println("Yetersiz kredi...");
                    dongu = false;
                }
            }//dongu sonu

            System.out.println("Secilen dersler");
            for (T03_Lesson each : secilenDersler) {
                System.out.println(each.name + " " + each.credit);
            }

        }//meth sonu

        @Override
        public String toString () {
            return "student Name='" + studentName;
        }
}
