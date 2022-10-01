import java.io.*;

class Main{
    private static void delay(){
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        WeatherStation weatherStation = new WeatherStation();
        AvgTemperatureDisplay avgTemperatureDisplay = new AvgTemperatureDisplay(weatherStation);
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherStation);

        weatherStation.updateParameters(100, 20);
        delay();

        weatherStation.updateParameters(80, 10);
        delay();

        weatherStation.updateParameters(50, 20);
    }
}