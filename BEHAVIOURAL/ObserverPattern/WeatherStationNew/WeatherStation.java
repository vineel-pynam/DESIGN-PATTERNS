public interface WeatherStation {
    public void register(Observer observer);
    public void deRegister(Observer observer);
    public void notifyObservers(WeatherData weatherData);
}
