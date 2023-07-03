package zerrin.task12;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String[] str = {"ade1r4d3"};
        String input = str[0];

int karakterlertoplami=hesaplakarakterlertoplami(input);
        System.out.println("karakterlertoplami = " + karakterlertoplami);
    }

    private static int hesaplakarakterlertoplami(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = Integer.parseInt(String.valueOf(ch));
                sum += digit;
            }
        }
        return sum;
        }






    }





