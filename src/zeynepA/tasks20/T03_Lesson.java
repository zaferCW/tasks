package zeynepA.tasks20;

public class T03_Lesson {

    String lessonName;
    int lessonCredit;

    public T03_Lesson() {

    }

    public T03_Lesson(String name, int credit) {
        this.lessonName = name;
        this.lessonCredit = credit;
    }

    @Override
    public String toString() {
        return "T03_Lesson{" +
                "name='" + lessonName + '\'' +
                ", credit=" + lessonCredit +
                '}';
    }
}
