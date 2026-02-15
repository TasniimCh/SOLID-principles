package ISP.dirty;

public class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }

    @Override
    public void playMusic() {
        // Irrelevant
        throw new UnsupportedOperationException("Light cannot play music");
    }

    @Override
    public void setTemperature(int temp) {
        // Irrelevant
        throw new UnsupportedOperationException("Light cannot change temperature");
    }
}