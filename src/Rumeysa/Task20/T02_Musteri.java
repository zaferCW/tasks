package Rumeysa.Task20;

public class T02_Musteri {

    /* Müsteri Class: fields: name T02_ElektrikHesabi class obj.
    T01_Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */

    //fields :

    String name;
   public T02_Musteri (String name) {
       this.name = name;
   }

    @Override
    public String toString() {
        return "Musteri{" +
                "name='" + name + '\'' +
                '}';
    }
}
