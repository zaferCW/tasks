package Rumeysa.Task20;

public class T01_Rectangle {

    //fields:
    double width;
    double length;

    public T01_Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public T01_Rectangle() {
    }

    public void hesapla(){
        double cevre = 2 * length + 2 * width;
        double alan = length * width;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }

}


