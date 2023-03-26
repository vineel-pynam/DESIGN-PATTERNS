import enums.*;

public class Main{
    public static void main(String args[]){
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.getMoviesByCity(City.DELHI);
        bookMyShow.getAllShowsByCityAndMovie("rrr");
        bookMyShow.getAvailableSeats(1,1);
        bookMyShow.createBooking(17);
        bookMyShow.createBooking(19);
        bookMyShow.createBooking(17);

        // bookMyShow.getMoviesByCity(City.CHENNAI);
        // bookMyShow.getAllShowsByCityAndMovie("BAHUBALI");

        // bookMyShow.getMoviesByCity(City.BANGLORE);
        // bookMyShow.getAllShowsByCityAndMovie("PATAN");


    }
}