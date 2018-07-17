package hometask1;

import hometask1.Functions.Function;
import hometask1.Phone.MobilePhone;
import hometask1.Phone.StationaryPhone;

public class Base {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        StationaryPhone stationaryPhone = new StationaryPhone();
        Function validator = new Function();

        /**validate phone number*/
        validator.validateNumber(validator.scanNumber());
    }
}
