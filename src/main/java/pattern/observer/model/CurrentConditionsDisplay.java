package pattern.observer.model;

import java.util.Observable;
import java.util.Observer;
import pattern.observer.mapper.DisplayElement;

/**
 * @author NNroc
 * @date 2020/8/3 19:28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
