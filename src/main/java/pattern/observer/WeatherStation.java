package pattern.observer;

import pattern.observer.model.CurrentConditionsDisplay;
import pattern.observer.model.WeatherData;

/**
 * @author NNroc
 * @date 2020/8/3 19:32
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
