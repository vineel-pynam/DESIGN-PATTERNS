import java.util.*;
class WeatherStation implements Observable{

    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    public int getTemperature(){
        return temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public boolean hasObserver(Observer observer){
        int index = observers.indexOf(observer);
        return index >= 0;
    }

    @Override
    public void notifyObservers(){
        observers.forEach(observer-> observer.update(temperature, humidity));
    }

    @Override
    public void registerObserver(Observer observer){
        if( !hasObserver(observer) ) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer){
       if( hasObserver(observer) ){
         observers.add(observer);
       }
    }

    public void updateParameters(int temperature, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}