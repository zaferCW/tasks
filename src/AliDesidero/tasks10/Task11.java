<<<<<<<< HEAD:src/meryem/tasks10/Task11.java
package meryem.tasks10;
========
package AliDesidero.tasks10;
>>>>>>>> origin/master:src/AliDesidero/tasks10/Task11.java

import java.util.Scanner;

public class Task11 {
static  Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */

<<<<<<<< HEAD:src/meryem/tasks10/Task11.java
        System.out.println("bir metin giriniz");
        String metin= input.nextLine().toLowerCase();
        hackerDili(metin);


    }//main sonu

    private static void hackerDili(String metin) {
metin.replaceAll("s", "5").replaceAll("a", "4").replaceAll("e","3").replaceAll("i","1").replaceAll("o","0");
========
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = input.nextLine();

        hackerDili(str);

    }

    private static void hackerDili(String str) {

        str = str.replace('s', '5');
        str = str.replace('a', '4');
        str = str.replace('e', '3');
        str = str.replace('i', '1');
        str = str.replace('o', '0');
        System.out.println(str);
    }
>>>>>>>> origin/master:src/AliDesidero/tasks10/Task11.java

    }


<<<<<<<< HEAD:src/meryem/tasks10/Task11.java
}//class sonu
========

>>>>>>>> origin/master:src/AliDesidero/tasks10/Task11.java
