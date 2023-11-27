package Rumeysa.Task20;

import java.util.ArrayList;

public class T03_Lesson {

   // fields : name, credit (1-10 arasında değer almalı)

    String name;
    int credit;

    public T03_Lesson (){

    }
    public T03_Lesson(String lectureName, int lcredit) {
        this.name = lectureName;
        if (lcredit <1 || lcredit > 10){
            System.out.println("hatali giris yaptiniz ");

        }else this.credit = lcredit;
    }


}
