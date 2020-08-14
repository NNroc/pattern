package pattern.facade;

/**
 * @author NNroc
 * @date 2020/8/14 14:42
 */
public class Thermometer {
    private double temperature = 36.6;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}