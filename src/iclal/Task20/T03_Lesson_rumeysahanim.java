package iclal.Task20;

public class T03_Lesson_rumeysahanim {

   // fields : name, credit (1-10 arasında değer almalı)

    String name;
    int credit;

    public T03_Lesson_rumeysahanim(){

    }
    public T03_Lesson_rumeysahanim(String lectureName, int lcredit) {
        this.name = lectureName;
        this.credit = lcredit;
    }


    @Override
    public String toString() {
        return "T03_Lesson{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
