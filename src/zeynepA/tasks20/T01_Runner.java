package zeynepA.tasks20;

public class T01_Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan T01_Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.

    */

    public static void main(String[] args) {

        T01_Rectangle rectangle = new T01_Rectangle(4,5);

        System.out.println("rectangle.cevre(rectangle.width,rectangle.length) = " + rectangle.cevre(rectangle.width, rectangle.length));

        System.out.println("rectangle.alan(rectangle.width,rectangle.length) = " + rectangle.alan(rectangle.width, rectangle.length));


    }




}
