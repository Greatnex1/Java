package CHP_8;

public class RectangleClass {
     public static void main(String[] args) {
          RectangleClassMethod rectangle = new RectangleClassMethod(7,7);
          double area = rectangle.area();
         System.out.println("The area of the given rectangle is " + area);

         double perimeter  = rectangle.perimeter();
         System.out.println("The perimeter of the given rectangle is " + perimeter);


     }
}