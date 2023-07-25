package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz
        List<Integer> sayiList=new ArrayList<>(List.of(5,47,86,32,85));
        Scanner input =new Scanner(System.in);
        System.out.println("Aratmak istediğniz sayıyı giriniz");
        int sayi=input.nextInt();
        boolean flag=false;
        for (int i = 0; i < sayiList.size(); i++) {
          if (sayiList.get(i)==sayi) {
              flag=true;
              break;
          }
        }
        if (flag){
            System.out.println("Sayi listede mevcuttur");

        }else  System.out.println("Sayi listede mevcut değildir");






    }
}
