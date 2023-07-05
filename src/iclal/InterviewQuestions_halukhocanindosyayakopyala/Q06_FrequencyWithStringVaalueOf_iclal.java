package iclal.InterviewQuestions_halukhocanindosyayakopyala;

public class Q06_FrequencyWithStringVaalueOf_iclal {
    /* Task->
  Count the frequency of the letters in a given String as the format below:
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
  "Java is so Good" stringi için kullanılan harflern tekrarını print eden code create ediniz.
   */
    public static void main(String[] args) {
        //ZORLANDIM

        //Chat GPT
        String str = "Java is so Good";
        String strOutput = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            //Chat GPT Character sınıfı açıklama
            // Character Java'nın bir sınıfıdır ve karakterlerle ilgili işlemler yapmak için çeşitli yöntemler ve sabitler sağlar.
            // Bu sınıfın bir örneği olan ch değişkeni, bir karakterin temsil edildiği yerdir.
            // Character.isLetter(ch) ifadesi, belirtilen karakterin bir harf olup olmadığını kontrol etmek için kullanılır.
            if (Character.isLetter(ch)) {
                for (int j = 0; j < str.length(); j++) {
                    if (Character.toLowerCase(ch) == Character.toLowerCase(str.charAt(j))) {
                        count++;
                    }
                }
                        /*
                        for (char c : str.toCharArray()) {
                             if (Character.toLowerCase(ch) == Character.toLowerCase(c)) {
                              count++;
                               }
                        }
                         */


                        /*
                        Örneğin, "Java is so Good" cümlesi için karakter frekansını hesapladığımızı düşünelim.
                        İkinci "a" harfi için frekansı 2'dir. İf koşulu olmadan, bu karakter iki kez çıktıya eklenir:
                        "a2 a2". Ancak if koşulu eklenerek, sadece ilk "a" harfi ve frekansı eklenir: "a2".
                        Böylece, her karakterin frekansı sadece bir kez görüntülenir ve çıktı doğru şekilde oluşturulur.
                         */
                if (!strOutput.contains(ch + "")) {
                    strOutput += ch + "" + count + " ";
                }
            }
        }

        System.out.println("Output: " + strOutput.trim());

    }


}
