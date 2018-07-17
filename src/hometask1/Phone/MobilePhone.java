package hometask1.Phone;

public class MobilePhone extends AbstractPhone {

    private String RAM;
    private String CPU;
    public final String ENTERCORRECTNUMBERMESSAGE = "Введите номер телефона в формате +(380)9XXXXXXXX: ";
    public final String UNCORRECTNUMBERMESSAGE = "Введен не корректный номер, номер телефона должен состоять из 13 символов и содержать код страны (+380)";

    public MobilePhone() {
    }

    public MobilePhone(String screenResolution, String color, String name, String RAM, String CPU) {
        super(screenResolution, color, name);
        this.RAM = RAM;
        this.CPU = CPU;
    }

    @Override
    public void startCall() {

    }

    @Override
    public void stopCall() {

    }

    @Override
    public void checkBattery() {
    }
}
