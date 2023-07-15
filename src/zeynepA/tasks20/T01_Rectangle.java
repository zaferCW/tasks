package zeynepA.tasks20;

public class T01_Rectangle {

    double width,length;

    double cevre (double width, double length){

        return 2*(width+length);

    }
double alan (double width, double length){

        return width*length;
}
public T01_Rectangle(){

}

    public T01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
