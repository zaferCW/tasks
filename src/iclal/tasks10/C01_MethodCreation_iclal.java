package iclal.tasks10;


public class C01_MethodCreation_iclal {
    public static void main(String[] args) {//main method başı
        System.out.println("Method creation başlıyor");


        toplaiclal();// method call edildi.parametresiz method
    }//main sonu


    private static void toplaiclal() {//otomatik kendisi create etti.

        System.out.println("İlk create ettiğimiz method");
        int a=55;
        int b=44;
        System.out.println(a+b);
        System.out.println("Toplaiclal isimli method çalıştı");
    }//toplaiclal sonu
}
