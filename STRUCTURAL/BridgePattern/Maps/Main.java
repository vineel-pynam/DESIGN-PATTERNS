public class Main{
    public static void main(String args[]){
        NavigationImpl googleMaps = new GoogleMaps();
        NavigationImpl appleMaps = new AppleMaps();
        
        Rapido rapido = new Rapido("Madhapur");
        rapido.setNavigationImpl(appleMaps);
        rapido.navigate("Begumpet");


        Ola ola = new Ola("Ameerpet");
        ola.setNavigationImpl(googleMaps);
        ola.navigate("Secundrabad");

    }
}