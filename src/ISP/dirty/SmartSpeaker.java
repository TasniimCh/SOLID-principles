package ISP.dirty;

public class SmartSpeaker implements SmartDevice {
    @Override
    public void turnOn() { System.out.println("Speaker is on"); }

    @Override
    public void turnOff() { System.out.println("Speaker is off"); }

    @Override
    public void playMusic() { System.out.println("Playing music"); }

    @Override
    public void setTemperature(int temp) {
        throw new UnsupportedOperationException("Speaker cannot change temperature");
    }
}