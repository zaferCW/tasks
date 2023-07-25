package iclal.Task20;


import java.util.ArrayList;

public class T03_Student_rumeysahanim {
    /* fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
     derslerin toplam kredi miktarını return eden  toplamKredisi method*/

    static ArrayList<T03_Lesson_rumeysahanim> dersler = new ArrayList<>();
    String studentName ;
    int maxCredit;

    public ArrayList<T03_Lesson_rumeysahanim> dersEkle(){
        T03_Lesson_rumeysahanim ders = new T03_Lesson_rumeysahanim("math", 3);
        T03_Lesson_rumeysahanim ders1 = new T03_Lesson_rumeysahanim("art", 2);
        T03_Lesson_rumeysahanim ders2 = new T03_Lesson_rumeysahanim("finance", 5);
        dersler.add(ders);
        dersler.add(ders1);
        dersler.add(ders2);
        return dersler;
    }

    public void toplamKredi(){
       int toplam = 0;
       T03_Lesson_rumeysahanim kredi = new T03_Lesson_rumeysahanim();


    }
}
