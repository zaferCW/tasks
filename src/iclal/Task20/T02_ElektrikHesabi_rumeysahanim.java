package iclal.Task20;

public class T02_ElektrikHesabi_rumeysahanim {
     /* ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method
    */

    // fields :
    static int toplamTuketim;
    double oran;
    double fatura;


    public T02_ElektrikHesabi_rumeysahanim() {
    }

    public void tüketimEkle(int ay, int tuketim){
       toplamTuketim = ay*tuketim;
       System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public void odenecekTutar(double oran){
        fatura = toplamTuketim*oran;
        System.out.println("fatura = " + fatura);
    }

}
