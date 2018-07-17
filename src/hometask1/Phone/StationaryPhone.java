package hometask1.Phone;

public class StationaryPhone extends AbstractPhone {

    String type;
    boolean autoresponder;

    public StationaryPhone() {
    }

    public StationaryPhone(String screenResolution, String color, String name, String type, boolean autoresponder) {
        super(screenResolution, color, name);
        this.type = type;
        this.autoresponder = autoresponder;
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
