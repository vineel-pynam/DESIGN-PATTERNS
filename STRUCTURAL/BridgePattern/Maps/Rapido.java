public class Rapido implements NavigationSystem{
    private String source;
    private NavigationImpl navigationImpl;

    public Rapido(String source){
        this.source = source;
    }

    public void setNavigationImpl(NavigationImpl navigationImpl){
        this.navigationImpl = navigationImpl;
    }
    
    @Override
    public void navigate(String destination){
        System.out.print("You booked Rapido from " + source + " to " + destination + " and Rapido is using ");
        navigationImpl.navigateTo(destination);
    }
}