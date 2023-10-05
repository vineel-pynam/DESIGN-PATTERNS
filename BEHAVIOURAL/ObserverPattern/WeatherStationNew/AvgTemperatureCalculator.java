public class AvgTemperatureCalculator implements Observer{
    private int totalTemperature;
    private int countOfTemperatures;

    @Override
    public void update(WeatherData weatherData){
        this.totalTemperature = weatherData.getTemperature();
        countOfTemperatures++;
        display();
    }

    private void display(){
        System.out.println("Average Temperature: " + ((double)totalTemperature/(double)countOfTemperatures));
    }    
}
