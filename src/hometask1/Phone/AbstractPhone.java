package hometask1.Phone;

import hometask1.Interfaces.PhoneInterface;

public abstract class AbstractPhone implements PhoneInterface {

    String screenResolution;
    String color;

    public AbstractPhone() {
    }

    public AbstractPhone(String screenResolution, String color) {
        this.screenResolution = screenResolution;
        this.color = color;
    }
}
