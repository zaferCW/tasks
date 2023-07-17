package zeynepA.tasks20;

import java.util.ArrayList;

public class T03_Student {

    String studentName;
    int studentMaxCredit;

    ArrayList<T03_Lesson> derslerList= new ArrayList<>();

    int toplamKredisi() {

        int toplam=0;

        for (int i = 1; i <=10 ; i++) {

            toplam+=i;
        }

       return toplam;
    }


}

