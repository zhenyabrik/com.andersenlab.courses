package hometask2.Shape;

public class Triangle extends AbstractShape {

    private double triangleSideA = randomGeometricDouble;
    private double triangleSideB = randomGeometricDouble;
    private double triangleSideC = randomGeometricDouble;

    @Override
    public void calculateArea() {
        System.out.println("Triangle side = " + triangleSideA + " cm.");
        double tempArea;
        tempArea = (Math.sqrt(3) / 4) * Math.pow(triangleSideA, 2);
        area = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Triangle area = " + area + " cm.2");
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 3 * triangleSideA;
        System.out.println("Triangle perimeter = " + perimeter + " cm.");
    }
}
