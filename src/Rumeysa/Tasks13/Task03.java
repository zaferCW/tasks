package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.


        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int istenen = 3;
        boolean varMi = false;

        for (int w : num) {
            if (w == istenen) {
                varMi = true;
                break;
            }
        }
        System.out.println(istenen + " var mi = " + varMi);
    }
}
