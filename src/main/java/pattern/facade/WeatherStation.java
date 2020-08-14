package pattern.facade;

/**
 * @author NNroc
 * @date 2020/8/14 14:38
 */
public class WeatherStation {
    Thermometer thermometer;

    public WeatherStation() {
        thermometer = new Thermometer();
    }

    public Thermometer getThermometer() {
        return thermometer;
    }

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }
}