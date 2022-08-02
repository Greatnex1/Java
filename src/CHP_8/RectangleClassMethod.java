package CHP_8;

public class RectangleClassMethod {
    private  double length;
    private double width ;


   public RectangleClassMethod(int length , int width ) {
       this.length = length;
      this.width = width;
   }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        }
    }
public double  perimeter(){
    return 2 * (length + width);
}
public double area(){
    return length * width;
}
}
