public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setHumidity(10);
        weatherData.setTemperature(100);
        weatherData.setStationName("Delhi Weather Station");

        Observer averageTemperatureCalculatorObserver = new AvgTemperatureCalculator();
        Observer weatherDisplayObserver = new WeatherDisplay();

        WeatherStation weatherStation = new DelhiWeatherStation();
        weatherStation.register(weatherDisplayObserver);
        weatherStation.register(averageTemperatureCalculatorObserver);

        weatherStation.notifyObservers(weatherData);
        weatherStation.notifyObservers(weatherData);

        weatherStation.deRegister(averageTemperatureCalculatorObserver);

        weatherStation.notifyObservers(weatherData);

    }
}
