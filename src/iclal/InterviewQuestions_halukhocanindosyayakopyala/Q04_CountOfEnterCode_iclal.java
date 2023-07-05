package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q04_CountOfEnterCode_iclal {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.
    //
    // Chat GPT task açıklaması...
    // Bu görev, kullanıcıdan alınan bir PIN kodunun üç denemede kontrol edilmesini istiyor.
    // PIN kodu, bir String olarak temsil edilir.
    // Görev, bu PIN kodunu kullanıcının üç denemede doğru girmesini kontrol etmeyi gerektiriyor.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int girisHakki=3;

        while(true){//şarta bağlı sonsuz döngü---//while(girisHakki>0)
            //flag ile de yapılabilir
            //boolean flag=true;
            //while(flag){
            //aşağıda flag=false yazarız  break; yerine
            System.out.println("agam pinini giresen");
            String agaPini=input.nextLine();
            if(agaPini.equals(pin)){
                System.out.println("bingooooo agam pinin ok :)");
                break;
            }else{
                System.out.println("agam mortingenŞitrause :");
                girisHakki--;
                System.out.println("agam kalan giris hakkın:"+girisHakki);
            }
            if(girisHakki==0){
                System.out.println("agam tüm hakları yedin. sim kart bloke :(");
                break;
            }
        }

    }//main sonu


}
