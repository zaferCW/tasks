package MustafaAba.tasks12;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String str="Hello World";
        String []arr=str.split("");
        String newStr="";
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i].replace('o','K');
            newStr+=arr[i];
        }
        System.out.println("newStr = " + newStr);

       



    }
}