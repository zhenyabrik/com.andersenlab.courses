package hometask2.Shape;

public class Circle extends AbstractShape {

    private final static String ENTERCIRCLERADIUS = "Enter Circle radius(format example: '2,99'): ";

    private double circleRadius = function.scanDoubleNumber(ENTERCIRCLERADIUS);

    @Override
    public double calculateArea() {
        System.out.println("Circle radius = " + circleRadius + " cm.");
        double tempArea;
        tempArea = (Math.PI) * Math.pow(circleRadius, 2);
        area = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Circle area = " + area + " cm.2");
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * circleRadius;
        System.out.println("Circle perimeter = " + perimeter + " cm.");
        return perimeter;
    }
}
