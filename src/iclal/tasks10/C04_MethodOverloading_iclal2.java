package iclal.tasks10;

public class C04_MethodOverloading_iclal2 {
    public static void main(String[] args) {

        // siz push biz pull
        //hoca push
        //öğrenci pull

        String str = "tam oturmasi icin birkac ornek daha gerekir";
        System.out.println("str.indexOf(o) = " + str.indexOf("o"));

        // output :-1 - bulamayınca -1 verir
        System.out.println("str.indexOf(25) = " + str.indexOf(25));
        //overload edilmiş bir metodu kullandık


        System.out.println("Overloading");

        //metot isimleri aynı ama parametreleri farklı

        // toplaiclalyeni();
        //toplaiclalyeni(1, 5);
        // toplaiclalyeni(1, 2, 4);

        System.out.println("toplaiclalyeni(1, 2, 4) = " + toplaiclalyeni(1, 2, 4));
        System.out.println("toplaiclalyeni('a', 'b', 'c') = " + toplaiclalyeni('a', 'b', 'c'));

        System.out.println("toplaiclalyeni(1, 5.2) = " + toplaiclalyeni(1, 5.2));

        //toplaiclalyeni("A", "B");
        System.out.println("toplaiclalyeni(\"A\", \"B\") = " + toplaiclalyeni("A", "B"));

    }

    private static String toplaiclalyeni(String a, String b) {
        System.out.println("iki pm si String olan method calisti");
        return a+b;
    }

    private static double toplaiclalyeni(int i, double v) {
        System.out.println("1. pm int 2. pm double olan meth calisti");
        return i+v;
    }

    private static int toplaiclalyeni(int i, int i1, int i2) {
        System.out.println("3 pm si int olan meth calisti");
        return i + i1 + i2;
    }

    private static int toplaiclalyeni(int i, int i1) {
        System.out.println("iki pm si int olan meth calisti");
        return i + i1;
    }

    private static int toplaiclalyeni() {
        System.out.println("pm siz meth calisti");
        int a=2;
        int b=3;
        int sonuc = (a + b);
        System.out.println("(a+b) = " + sonuc);
        return sonuc;
    }
}

