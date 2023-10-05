import java.util.*;

public class DelhiWeatherStation implements WeatherStation {
    private List<Observer> observersList = new ArrayList<Observer>();

    @Override
    public void register(Observer observer){
        observersList.add(observer);
    }

    @Override
    public void deRegister(Observer observer){
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers(WeatherData weatherData){
        for( Observer observer : observersList){
            observer.update(weatherData);
        }
    }


}
