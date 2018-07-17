package hometask1.Phone;

public class MobilePhone extends AbstractPhone {

    private String RAM;
    private String CPU;

    public MobilePhone() {
    }

    public MobilePhone(String screenResolution, String color, String RAM, String CPU) {
        super(screenResolution, color);
        this.RAM = RAM;
        this.CPU = CPU;
    }

    @Override
    public void startCall() {

    }

    @Override
    public void stopCall() {

    }

}
