package hometask1;

import hometask1.Functions.Function;
import hometask1.Phone.MobilePhone;
import hometask1.Phone.StationaryPhone;

public class Base {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        StationaryPhone stationaryPhone = new StationaryPhone();
        Function function = new Function();

/**validate phone number*/
        function.validateNumber(function.scanNumber());
        System.out.println("===");
/**average value from array*/
        function.averageValue();
        System.out.println("===");
/**factorial of a number*/
        function.factorialOfNumber();
        System.out.println("===");
/**factorial of a number*/
        function.fibonacciRow();
    }
}
