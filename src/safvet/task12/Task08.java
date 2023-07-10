package safvet.task12;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        int[] arr = {13, 6, 23, 14, 57, 66, 91};
        System.out.println("Tek sayilar : ");

        for (int numara : arr) { // burda bir atama yaptim numara degerine int arr degerindeki sayilari atayip
            if (numara % 2 == 1) { // burda tek sayi oldugunu bulup
                System.out.print(numara+ " "); // burda yazdirildi ..
            }
        }
    }
}

