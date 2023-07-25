package OzelTaskler;

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


     System.out.println(convertRomans("MCMXLV"));
}

    static int convertRomans(String s) {
        int sum = 0;
        // In the first loop we are checking and adding the values of
        // ascending numbers
        // (the ones in the brackets in the example),
        // after using those, we remove them from String because they are useless.

        for (int i = 0; i < s.length() - 1; i++) {
            if (valueOf(s.charAt(i)) < valueOf(s.charAt(i + 1))) {
                sum += valueOf(s.charAt(i + 1)) - valueOf(s.charAt(i));
                s = s.replace(s.substring(i, i + 2), "");
                i--; // when we remove two characters from String,
                // we adjust the index
                // not to miss any any char.
            }
        }
		/* After removing the annoying characters(ascending numerals), we have the
		 regular characters which are in descending order.
		   With the for loop we add the values to our 'sum' container. */
        for (int i = 0; i < s.length(); i++) {
            sum += valueOf(s.charAt(i));
        }
        return sum;
    }

    // assign the values for each character of Roman numerals
    static int valueOf(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }

    /*
    2. yol
     public static void main(String[] args) {
        System.out.println("fromRoman(\"DCCCV\") = " + fromRoman("DCCCV"));
    }

    public static int fromRoman(String roman) {
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currValue = romanToNumber(roman.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

    public static int romanToNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
     */
/*
map ile cozum
import java.util.HashMap;

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

    public static int fromRomans(String roman) {
        int decimal = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = romanToDecimal.get(roman.charAt(i));
            if (current < prev) {
                decimal -= current;
            } else {
                decimal += current;
            }
            prev = current;
        }
        return decimal;
    }

    public static String romanNumbers(int decimal) {
        StringBuilder roman = new StringBuilder();
        int[] decimalValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumeral = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimalValue.length; i++) {
            while (decimal >= decimalValue[i]) {
                decimal -= decimalValue[i];
                roman.append(romanNumeral[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        String roman = "DCCCV";
        int decimal = 805;

        System.out.println(roman + "   " + fromRomans(roman));
        System.out.println(decimal + "   " + romanNumbers(decimal));
    }
}

 */

}
