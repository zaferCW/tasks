package MeryemT.Tasks13;

import java.util.ArrayList;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int[] numbs = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisik(numbs));
    }

    private static ArrayList<Integer> ardisik(int[] numbs) {
//      int[] numbs = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        ArrayList<Integer> answ = new ArrayList<>();

        for (int i = 0; i < numbs.length; i++) {
            int toplam = 0;

            for (int j = 0; j <= i; j++) {
                if (i < 2) {
                    toplam += numbs[(i + j)];
                } else if (i == 3) {
                    toplam += numbs[(i * 2 + j)];
                } else {
                    toplam += numbs[(i * 2 + j - 1)];
                }
            }
            answ.add(toplam);
            if (answ.size() == 4) {
                break;
            }
        }
        return answ;
    }



    }

