package hometask2.Shape;

public class Rectangle extends AbstractShape {

    private double rectangleHeight = randomGeometricDouble * 2;
    private double rectangleWidth = randomGeometricDouble;

    @Override
    public double calculateArea() {
        System.out.println("Rectangle height = " + rectangleHeight + " cm.");
        System.out.println("Rectangle width = " + rectangleWidth + " cm.");
        double tempArea;
        tempArea = rectangleHeight * rectangleWidth;
        area = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Rectangle area = " + area + " cm.2");
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (2 * rectangleHeight) + (2 * rectangleWidth);
        System.out.println("Rectangle perimeter = " + perimeter + " cm.");
        return perimeter;
    }
}
