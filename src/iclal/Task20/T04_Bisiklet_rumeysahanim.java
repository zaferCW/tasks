package iclal.Task20;

public class T04_Bisiklet_rumeysahanim {

    double hiz;
    int vites;

    public T04_Bisiklet_rumeysahanim() {
    }

    public T04_Bisiklet_rumeysahanim(double hiz, int vites) {
        this.hiz = hiz;
        if (vites < 1 & vites > 5) {
            System.out.println("vites 1-5 arasinda olmalidir");
        } else this.vites = vites;
    }

    public void hizdegistir(int yeniHiz) {
        this.hiz = yeniHiz;
    }

    public void vitesArtir() {
        this.vites = (vites) + 1;
    }

    public void vitesAzalt() {
        this.vites = vites - 1;
    }

    public void durumGoster() {
        System.out.println("hiz = " + hiz + "\nvites = " + vites);
    }

    public double getHiz() {
        return hiz;
    }

    public int getVites() {
        return vites;
    }

    @Override
    public String toString() {
        return "T04_Bisiklet{" +
                "hiz=" + hiz +
                ", vites=" + vites +
                '}';
    }
}