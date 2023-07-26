package MeryemT.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task14 {
static  Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */


        System.out.println("saatlik çalışma ücreti giriniz: ");
        double calismaucre= input.nextDouble();

        System.out.println("hangi saat başladı  giriniz: ");
        double baslamaSaat= input.nextDouble();

        System.out.println("hangi saat bitti giriniz: ");
        double bitisSaat= input.nextDouble();

        System.out.println("mesaiyi kaçla katlayacağız giriniz: ");
        double mesaikat= input.nextDouble();

        ucretHesaplama(calismaucre,baslamaSaat,bitisSaat,mesaikat);

    }//main sonu

    private static void ucretHesaplama(double calismaucre, double baslamaSaat, double bitisSaat, double mesaikat) {
       double toplamucret=0;
        if (baslamaSaat>=9 && bitisSaat<=17){
            toplamucret=8*calismaucre;
        }
        if (baslamaSaat>17 && bitisSaat<=20){
            toplamucret+=mesaikat*calismaucre*1.8;

        }
        System.out.println("toplam ucret "+toplamucret);
    }



}
