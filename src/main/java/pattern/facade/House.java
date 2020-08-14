package pattern.facade;

/**
 * @author NNroc
 * @date 2020/8/14 14:38
 */
public class House {
    WeatherStation station;

//    其他的方法和构造器
//    违反最少知识原则，因为此调用的方法属于另一侧调用返回的对象
//    public double getTemp(){
//        return station.getThermometer().getTemperature();
//    }

    // 没有违反最少知识原则，但是没什么意义
    public double getTemp() {
        Thermometer thermometer = station.getThermometer();
        return getTempHelper(thermometer);
    }

    public double getTempHelper(Thermometer thermometer) {
        return thermometer.getTemperature();
    }
}