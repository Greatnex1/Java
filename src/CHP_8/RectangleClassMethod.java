package CHP_8;

public class RectangleClassMethod {
    private  double length = 1.0;
    private double width = 1.0 ;


//    public RectangleClassMethod(int length , int width ) {
//        this.length = length;
//        this.width = width;
//    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0)
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width <20.0)
        this.width = width;
    }
public double  perimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
}
public double area(){
       double area = length * width;
       return area;
}
}
