package iclal.tasks10;

import java.util.Scanner;

public class C02_MethodCreation_iclal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci notunu gir");
        double not1 = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("İkinci notunu gir");
        double not2 = input.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Üçüncü notunu gir");
        double not3 = input.nextDouble();


        ortalamaHesaplaiclal(not1, not2, not3);
        System.out.println("OrtalamaHesapla(not1,not2,not3) = " + ortalamaHesaplaiclal(not1, not2, not3));


    }

    private static double ortalamaHesaplaiclal(double not1, double not2, double not3) {

        return (not1 + not2 + not3) / 3;


    }


}
