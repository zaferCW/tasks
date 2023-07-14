package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> listNum = new ArrayList<>();

        listNum.add(5);
        listNum.add(4);
        listNum.add(3);
        listNum.add(1);
        listNum.add(6);
        listNum.add(2);
        listNum.add(9);

        int toplam = 0;

        for (int i : listNum) {

            toplam +=  i * i;
        }
        System.out.println("sayilarin karesinin toplami = " + toplam);
    }
}
