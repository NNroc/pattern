package pattern.observer.model;

import pattern.observer.mapper.DisplayElement;
import pattern.observer.mapper.Observer;
import pattern.observer.mapper.Subject;

/**
 * @author NNroc
 * @date 2020/8/3 19:28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(double temp, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
