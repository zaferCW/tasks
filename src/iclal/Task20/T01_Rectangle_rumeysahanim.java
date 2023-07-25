package iclal.Task20;

public class T01_Rectangle_rumeysahanim {

    //fields:
    double width;
    double length;

    public T01_Rectangle_rumeysahanim(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public T01_Rectangle_rumeysahanim() {
    }

    public void hesapla(){
        double cevre = 2 * length + 2 * width;
        double alan = length * width;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }

    @Override
    public String toString() {
        return "T01_Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}


