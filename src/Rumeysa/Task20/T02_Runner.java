package Rumeysa.Task20;

public class T02_Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name T02_ElektrikHesabi class obj.
    T01_Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    public static void main(String[] args) {


       T02_Musteri musteri = new T02_Musteri("ali");
        System.out.println(musteri);
        T02_ElektrikHesabi obj = new T02_ElektrikHesabi(100,2);
        System.out.println("fatura = " + obj.odenecekTutar());
        System.out.println("toplam tuketim = " + obj.toplamTuketim);


    }
}