package MyPractices;

public class DrawTriangle {

    public static void main(String[] args) {
        drawTriangle();
        drawTwoTriangles();

    }

    private static void drawTwoTriangles() {
        drawTriangle();
        drawTriangle();
    }

    private static void drawTriangle() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
    }
}

