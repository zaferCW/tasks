package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    static Scanner input = new Scanner(System.in);
    static List<Integer> biggerThanAverage = new ArrayList<>();
    static double toplam = 0;
    static int count = 0;

    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        String input1 = "";
        List<Integer> myList = new ArrayList<>(List.of());
        while (!input1.equals("n")) {
            System.out.println("Lütfen istediğiniz kadar sayı giriniz çıkmak isterseniz 'n' ya basınız");
            input1 = input.next();
            if (!input1.equals("n")){
                myList.add(Integer.valueOf(input1));
                toplam += Integer.valueOf(input1);
                count++;
            }

        }
        double average = getAverage(toplam);
        System.out.println("average = " + average);

        System.out.println("ortalamadan büyük olan değerler listesi = " + biggerThanAverage1(myList, average));


    }

    private static List<Integer> biggerThanAverage1(List<Integer> lst,double avr) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > avr) {
                biggerThanAverage.add(lst.get(i));
            }
        }
        return biggerThanAverage;
    }

    private static double getAverage(double top) {
        return top / count;
    }


}
