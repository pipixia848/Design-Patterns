package d16_观察者模式;

public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.registerObserver(currentConditions);

        weatherData.setData(10, 20, 40);


    }
}
