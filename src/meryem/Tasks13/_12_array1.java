package meryem.Tasks13;

import java.util.Arrays;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

        static  int count=0;
        public static void main(String[] args) {
            int[] array1 = {1, 2, 1, 1,3,4,1,};

            System.out.println("array1.toString() = " + Arrays.toString(array1));
            System.out.println("dupicate(array1) = " + dupicate(array1)+ "   "+count);// method creat edilerel sout yapıldı


        }//main sonu

        private static boolean dupicate(int[] array1) {

            for (int i = 0; i < array1.length; i++) {
                for (int j = 1; j < array1.length;j++){
                    if (array1[i] == array1[j]) {//arryin i ninci elamanı giger elamanlara eşit olup olmadıgı kontrol edildi
                        count++;
                        //  System.out.println(array1[i]+" sayısından " + count +" tane var");
                        return true;

                    }
                }
            }
            return false;
        }




    }


