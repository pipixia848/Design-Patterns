package d16_观察者模式;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    //构造器
    public WeatherData() {
        observers = new ArrayList<Observer>();

    }


    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {

        notifyObservers();
    }

    //当有数据更新时，调用
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }


    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    //通知所有观察者 遍历
    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }

    }
}
