class AvgTemperatureDisplay implements Observer{
    private int sumOfTemperature;
    private int totalTemperatures;


    private Observable weatherStation;
    public AvgTemperatureDisplay(Observable weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity){
        this.sumOfTemperature += temperature;
        this.totalTemperatures++;
        display();
    }

    public void display(){
        System.out.println("Average Temperature: " + (sumOfTemperature/totalTemperatures) );
    }
}