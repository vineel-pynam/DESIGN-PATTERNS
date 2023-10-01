import enums.*;
import java.util.*;

public class BookMyShow{

    MovieController movieController;
    TheatreController theatreController;
    City citySelected;
    Show showSelected;
    Movie movieSelected;
    Theatre theatreSelected;


    public BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();
        initialize();
    }

    public void getMoviesByCity(City currentCity){
        citySelected = currentCity;
        List<Movie> movies  = movieController.getMoviesByCity(citySelected);
        System.out.println("Currently Available Movies In : " + currentCity.toString() );
        for( Movie movie : movies ){
            System.out.println(movie.getName() + " --- " + movie.getDuration());
        }
    }

    public void getAllShowsByCityAndMovie(String movieName){
        System.out.println("Selected Movie: " + movieName.toUpperCase());
        Movie movie = movieController.getMovieByName(movieName);
        movieSelected = movie;

        theatreController.getAllShowsByCityAndMovie(citySelected, movieSelected);
    }


    public void getAvailableSeats(Integer theatreId, Integer showId){
        Map<Theatre, List<Show>> allTheatresWithShows = theatreController.getAllShows(citySelected, movieSelected);
        for( Map.Entry<Theatre, List<Show>> entry : allTheatresWithShows.entrySet() ){
            if( entry.getKey().getTheatreId() == theatreId ){
                theatreSelected = entry.getKey();
                for( Show show : entry.getValue() ){
                    if( show.getShowId() == showId ){
                        showSelected = show;
                        break;
                    }
                }
                break;
                
            }
        }

        if( showSelected == null ){
            System.out.println("Theatre/Show cannot be found...!");
            return;
        }
        
        System.out.println("Silver Category: ");
        for( Seat seat : showSelected.getScreen().getSeats() ){
            if( seat.getSeatCategory().equals(SeatCategory.SILVER) && !showSelected.getBookedId().contains(seat.getSeatId()) ){
                System.out.print(seat.getSeatId() + " ");
            }
        }   
        System.out.println();

        System.out.println("Gold Category: ");
        for( Seat seat : showSelected.getScreen().getSeats() ){
            if( seat.getSeatCategory().equals(SeatCategory.GOLD) && !showSelected.getBookedId().contains(seat.getSeatId()) ){
                System.out.print(seat.getSeatId() + " ");
            }
        }   
        System.out.println();

        System.out.println("Platinum Category: ");
        for( Seat seat : showSelected.getScreen().getSeats() ){
            if( seat.getSeatCategory().equals(SeatCategory.PLATINUM) && !showSelected.getBookedId().contains(seat.getSeatId()) ){
                System.out.print(seat.getSeatId() + " ");
            }
        }   
    }


    public void createBooking(int seatNumber){
        System.out.println();
        if( showSelected.getBookedId().contains(seatNumber) ) {
            System.out.println("Seat is Already Booked...!");
            return;
        }

        showSelected.getBookedId().add(seatNumber);
        
        System.out.println("SuccessFully Booked Seat...!");
    }   


    public void initialize(){
        createMovies();
        createTheatres();
    }

    public void createMovies(){
        Movie rrr = new Movie(1, "RRR", 150);
        Movie bahubali = new Movie(2, "Bahubali", 145);
        Movie patan = new Movie(3, "PATAN", 140);

        movieController.addMovie(City.DELHI, rrr);
        movieController.addMovie(City.DELHI, bahubali);
        movieController.addMovie(City.BANGLORE, bahubali);
        movieController.addMovie(City.BANGLORE, patan);
        movieController.addMovie(City.CHENNAI, patan);
        movieController.addMovie(City.CHENNAI, rrr);
    }


    public void createTheatres(){

        Movie rrr = movieController.getMovieByName("rrr");
        Movie bahubali = movieController.getMovieByName("bahubali");
        Movie patan = movieController.getMovieByName("patan");

        Theatre theatre1 = new Theatre();
        theatre1.setTheatreId(1);
        theatre1.setScreens(createScreens());
        List<Show> theatre1Shows = new ArrayList<>();
        Show show1 = new Show(1, rrr, theatre1.getScreens().get(0), 8);
        Show show2 = new Show(2, bahubali, theatre1.getScreens().get(1), 16);
        theatre1Shows.add(show1);
        theatre1Shows.add(show2);
        theatre1.setShows(theatre1Shows);

        Theatre theatre2 = new Theatre();
        theatre2.setTheatreId(2);
        theatre2.setScreens(createScreens());
        List<Show> theatre2Shows = new ArrayList<>();
        Show show3 = new Show(1, patan, theatre2.getScreens().get(0), 8);
        Show show4 = new Show(2, rrr, theatre2.getScreens().get(1), 16);
        theatre2Shows.add(show3);
        theatre2Shows.add(show4);
        theatre2.setShows(theatre2Shows);

        theatreController.addTheatre(City.DELHI, theatre1);
        theatreController.addTheatre(City.BANGLORE, theatre2);
        theatreController.addTheatre(City.CHENNAI, theatre1);
        theatreController.addTheatre(City.CHENNAI, theatre2);

    }


    public List<Screen> createScreens(){
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());

        Screen screen2 = new Screen();
        screen2.setScreenId(2);
        screen2.setSeats(createSeats());

        return Arrays.asList(screen1, screen2);
    }

    public List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        for( int i=1; i<=10; i++ ){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

         for( int i=11; i<=20; i++ ){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

         for( int i=21; i<=30; i++ ){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

}