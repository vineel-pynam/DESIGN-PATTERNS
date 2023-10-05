public class WeatherDisplay implements Observer{
    
    private int temperature;
    private int humidity;

    public WeatherDisplay() {
    }


    @Override
    public void update(WeatherData weatherData){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    private void display(){
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }
}
