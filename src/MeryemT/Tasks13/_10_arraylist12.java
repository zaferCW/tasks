package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = new ArrayList<Integer>(List.of(5, 1, 22, 10, 20, 14, 8, 25, 30, 28));
        System.out.println("list = " + list);
        int count= rangeBtw(list);
        System.out.println("count = " + count);
       // Collections.sort(list);
       // System.out.println("Sıralanmış Liste: " + list);
    }//main sonu


    private static int rangeBtw(ArrayList<Integer> list) {
       int count=0;
        int min =list.get(0);
        int max=list.get(0);
        for (int i = 1; i <list.size() ; i++) {
           int num=list.get(i);
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        for (int i = 0; i <list.size(); i++) {
            int num=list.get(i);
            if (num>min && num<max){
                count++;
            }
        }
        return count;
    }



}//class sonu