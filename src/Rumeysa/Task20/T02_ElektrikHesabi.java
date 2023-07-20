package Rumeysa.Task20;

public class T02_ElektrikHesabi {
     /* ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method
    */

    // fields :
    int toplamTuketim;
    double oran = 0.7;
    double fatura;


    public T02_ElektrikHesabi() {
    }

    public T02_ElektrikHesabi(int tuketim, int ay ) {
       tuketimEkle(tuketim, ay);
    }

    public void tuketimEkle(int enerji1, int ay){
       toplamTuketim += enerji1*ay;
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public double odenecekTutar(){
        return fatura = toplamTuketim*oran;
    }

    @Override
    public String toString() {
        return "T02_ElektrikHesabi{" +
                "toplamTuketim=" + toplamTuketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
}
