package hometask2.Shape;

public class Square extends AbstractShape {

    private double squareHeight = randomGeometricDouble;
    private double squareWidth = randomGeometricDouble;

    @Override
    public double calculateArea() {
        System.out.println("Square side = " + squareHeight + " cm.");
        double tempArea;
        tempArea = squareHeight * squareHeight;
        area = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Square area = " + area + " cm.2");
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * squareHeight;
        System.out.println("Square perimeter = " + perimeter + " cm.");
        return perimeter;
    }
}
