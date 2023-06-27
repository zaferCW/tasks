package meryem.task12;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24
        int maxElement = Integer.MIN_VALUE;  // En küçük değerle başlatılır
        System.out.println(maxElement);

       // for (int[] sublist : sayi) {  // Her bir alt liste için
        for (int i = 0; i < sayi.length; i++) {  // İlk boyutun boyutu kadar döngü
            int[] sublist = sayi[i];  // Alt liste
           // for (int element : sublist) {  // Alt listedeki her bir eleman için
            for (int j = 0; j < sublist.length; j++) {  // Alt listenin boyutu kadar döngü
                int element = sublist[j];  // Eleman

                if (element > maxElement) {
                    maxElement = element;
                    System.out.println("maxElement = " + maxElement);
                }
            }
        }

        System.out.println("En büyük eleman: " + maxElement);
    }


    }

