package dev.study.옵저버.basic2;

import java.util.ArrayList;
import java.util.List;

/**
 * 날씨 정보 알림
 *  - 날씨 데이터를 관리하는 WeatherStation (주체)가 구독자(옵저버)에게 날씨 정보를 알려주기
 *
 *  WeatherObserver -> update(float temperature, float humidity))
 *  , WeatherStation, addObserver, deleteObserver, notifyObserver, setWeatherData, MobileDevice
 */

interface WeatherObserver{
    void update(float temperature, float humidity);
}

class WeatherStation{
    private final List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    //옵저버 등록
    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void deleteObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(WeatherObserver observer : observers){
            observer.update(temperature, humidity);
        }
    }

    //상태 변경 메서드
    public void setWeatherData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

}

class MobileDevice implements WeatherObserver{
    private final String name;

    public MobileDevice(String name){
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity){
        System.out.println(name + " Temp = " + temperature + "Humid = " + humidity );
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MobileDevice m1 =  new MobileDevice("갤럭시");
        MobileDevice m2 =  new MobileDevice("아이폰");

        weatherStation.addObserver(m1);
        weatherStation.addObserver(m2);

        weatherStation.setWeatherData(3.0f, 15.0f);
        weatherStation.setWeatherData(1.0f, 16.0f);
    }
}
