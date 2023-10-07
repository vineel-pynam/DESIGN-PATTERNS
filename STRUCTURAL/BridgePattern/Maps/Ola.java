public class Ola implements NavigationSystem{
    private String source;
    private NavigationImpl navigationImpl;

    public Ola(String source){
        this.source = source;
    }

    public void setNavigationImpl(NavigationImpl navigationImpl){
        this.navigationImpl = navigationImpl;
    }
    
    @Override
    public void navigate(String destination){
        System.out.print("You booked Ola from " + source + " to " + destination + " and Ola is using ");
        navigationImpl.navigateTo(destination);
    }
}