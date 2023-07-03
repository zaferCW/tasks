package haftalikTaskler;

public class T07_RomaRakamlari {
    /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) --->
		   		 [C M]=900

		   		 Roma rakamları, rakamlar yan yana getirilerek ve rakam değerleri
		   		  toplanarak yazılır. Örneğin 1 sayısı I şeklinde, 2 sayısı II
		   		  şeklinde, 3 sayısı III şeklinde yazılır. Ancak en fazla 3
		   		  tane aynı rakam yan yana gelebilir. Örneğin 4 sayısını IIII
		   		   şeklinde yazamayız. 4 sayısını yazmak için bir tane 5 ve
		   		   soluna 1 yazarız. Yani IV. Buradan da anlaşılabileceği gibi
		   		   eğer küçük olan rakam büyük rakamın solundaysa büyük rakamdan
		   		   çıkarılır. 6 sayısı VI, 7 sayısı VII, 8 sayısı VIII şeklinde
		   		   yazılır. Buna göre de eğer küçük rakam büyük rakamın sağındaysa
		   		   büyük rakamla toplanır.
		*/
    public static void main(String[] args) {



}



/*

public class RomanNumeralConverter {
    private static final HashMap<Character, Integer> romanToDecimal = new HashMap<>();
    static {
        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);
    }

 */

}
