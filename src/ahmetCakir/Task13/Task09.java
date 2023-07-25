package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> numList=new ArrayList<>(List.of(7,45,9,6,3,2,1,47));
        int kareToplam=karesiniBul(numList);
        System.out.println("kareToplam = " + kareToplam);
    }

    private static int karesiniBul(List<Integer> lst) {
        int kareTop=0;
        for (int i = 0; i <lst.size() ; i++) {
            kareTop+=Math.pow(lst.get(i),2);
        }
        return kareTop;
    }

}

