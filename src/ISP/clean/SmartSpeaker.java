package ISP.clean;

public class SmartSpeaker implements ILightControl, IAudioControl {
    @Override
    public void turnOn() { System.out.println("Speaker is on"); }

    @Override
    public void turnOff() { System.out.println("Speaker is off"); }

    @Override
    public void playMusic() { System.out.println("Playing music"); }
}