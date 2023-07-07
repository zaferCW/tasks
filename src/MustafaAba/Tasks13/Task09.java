package MustafaAba.Tasks13;

import Tasks13.Task08;

import java.util.ArrayList;


public class Task09 {
    static ArrayList<Integer> numlist = new ArrayList<>();

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        System.out.println("sumOfSquares(numlist) = " + sumOfSquares(numlist));
    }

    private static int sumOfSquares(ArrayList<Integer> numlist) {
        numlist = Task08.getUser();
        System.out.println("numlist = " + numlist);
        int toplam = 0;
        for (int i = 0; i < numlist.size(); i++) {
            numlist.set(i, numlist.get(i) * numlist.get(i));
            toplam += numlist.get(i);
        }
        return toplam;
    }


}

