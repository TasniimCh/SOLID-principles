package ISP.clean;

public class SmartThermostat implements IClimateControl {
    @Override
    public void setTemperature(int temp) {
        System.out.println("Temperature set to " + temp + "°C");
    }
}