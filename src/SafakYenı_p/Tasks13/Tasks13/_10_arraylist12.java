package SafakYenı_p.Tasks13.Tasks13;

import java.util.ArrayList;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(22);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(14);
        arrayList.add(8);
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(28);

        int min = 20;
        int max = 30;

        int count = rangeBtw(arrayList, min, max);
        System.out.println("Count: " + count);
    }

    public static int rangeBtw(ArrayList<Integer> arrayList, int min, int max) {
        int count = 0;

        for (int num : arrayList) {
            if (num >= min && num <= max) {
                count++;
            }
        }
        return count;
    }
}






