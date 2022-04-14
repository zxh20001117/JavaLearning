package experiment5;

public class ShapesDemo {
    public static void main(String[] args) {
        Shape shape;
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();
        Ellipse ellipse =new Ellipse();
        triangle.setA(6);
        hexagon.setA(9);
        ellipse.setAB(12,8);
        shape = triangle;
        System.out.printf("等边三角形的周长为：%.4f，面积为：%.4f\n",shape.getC(),shape.getS());
        shape = hexagon;
        System.out.printf("等边六边形的周长为：%.4f，面积为：%.4f\n",shape.getC(),shape.getS());
        shape = ellipse;
        System.out.printf("椭圆的周长为：%.4f，面积为：%.4f\n",shape.getC(),shape.getS());
    }
}
