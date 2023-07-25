package iclal.Task20.;

public class T02_Runner_rumeysahanim {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name T02_ElektrikHesabi class obj.
    T01_Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    public static void main(String[] args) {


       T02_Musteri_rumeysahanim musteri = new T02_Musteri_rumeysahanim("ali");
       T02_ElektrikHesabi_rumeysahanim obj = new T02_ElektrikHesabi_rumeysahanim();
       obj.odenecekTutar(0.7);
       obj.tüketimEkle(2,100);

    }
}