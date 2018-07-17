package hometask1.Phone;

import hometask1.Interfaces.PhoneInterface;

public abstract class AbstractPhone implements PhoneInterface {

    private String screenResolution;
    private String color;
    private String name;

    public final String ENTEREDNUMBERMESSAGE = "Вы ввели номер: ";
    public final String CORRECTNUMBERMESSAGE = "Вы ввели корректный номер";

    public AbstractPhone() {
    }

    public AbstractPhone(String screenResolution, String color, String name) {
        this.screenResolution = screenResolution;
        this.color = color;
        this.name = name;
    }
}
