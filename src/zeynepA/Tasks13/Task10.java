package zeynepA.Tasks13;


import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */


        //  int[] number = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        int[] input = {1, 2, 6, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        int[] output = removeDuplicates(input);

        System.out.println("OUTPUT: " + Arrays.toString(output));
    }

    public static int[] removeDuplicates(int[] input) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : input) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] output = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            output[i] = uniqueList.get(i);
        }

        return output;


        //   Scanner input = new Scanner(System.in);
        //   System.out.println("Array in boyutunu giriniz");
        //   int boyut= input.nextInt();
//
        //   int [] number = new int[boyut];
//
        //   System.out.println("Array in elemanlarını giriniz");
//
        //   for (int i = 0; i < boyut; i++) {
//
        //       number[i] = input.nextInt();
//
        //   }

        //   ArrayList<Integer> tekrarsızSayilar = new ArrayList<>();

        //   for (int i = 0; i < number.length; i++) {
        //       boolean yinelenenSayi = false;
        //       for (int j = i + 1; j < number.length; j++) {
        //           if (number[j] == number[i]) {
        //               yinelenenSayi = true;
        //               break;
        //           }
        //       }
        //       if (!yinelenenSayi) {
        //           tekrarsızSayilar.add(number[i]);
        //       }
        //   }

        //   int[] yeniArr = new int[tekrarsızSayilar.size()];

        //   for (int i = 0; i < tekrarsızSayilar.size(); i++) {

        //       yeniArr[i] = tekrarsızSayilar.get(i);


        //   }
        //   //Yeni diziyi yazdıralim

        //   for (int num : yeniArr) {

        //       System.out.println(num + " ");

        //   }

    }
}