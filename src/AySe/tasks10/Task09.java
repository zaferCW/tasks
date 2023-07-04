package tasks10;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        System.out.println(howManySeconds(2));
    }

    private static int howManySeconds(int i) {
        int dk = i * 60;
        int sn = dk * 60;
        return sn;

    }
}
