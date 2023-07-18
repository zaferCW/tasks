package SafakYenı_p.task12;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz...
        Scanner sc = new Scanner(System.in);
        System.out.println("Ne kadar gireceksiniz : ");
        int boyut = sc.nextInt();

        int [] arr = new int[boyut];
        System.out.println("Sayilari gir : ");
        for (int i = 0; i <boyut ; i++) {
            arr[i]= sc.nextInt();
        }
        int toplam = 0 ;
        for(int number : arr){
            toplam+=number;
        }
        double ortalama = (double)toplam/boyut;

        int degerler = 0 ;
        for (int number : arr){
            if (number> degerler){
                degerler++;

            }
        }
        System.out.println("Ortalamadan büyük sayilar : " + degerler);







    }
}
