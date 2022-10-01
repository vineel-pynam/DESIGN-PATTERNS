class WeatherDisplay implements Observer{

    private int temperature;
    private int humidity;

    private Observable weatherStation;
    public WeatherDisplay(Observable weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        System.out.println();
    }

    public void display(){
        System.out.println("Temperature: " + temperature + " \n" + "Humidity: " + humidity);
    }
}