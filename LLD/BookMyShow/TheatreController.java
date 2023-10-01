import enums.*;
import java.util.*;

public class TheatreController{
    Map<City, List<Theatre>> cityToTheatre;
    List<Theatre> allTheatres;


    public TheatreController() {
        cityToTheatre = new HashMap<City, List<Theatre>>();
        allTheatres = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre){
        List<Theatre> theatres = cityToTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityToTheatre.put(city, theatres);
        allTheatres.add(theatre);
    }

    public Map<Theatre, List<Show>> getAllShows(City city, Movie movie){
        List<Theatre> theatres = cityToTheatre.getOrDefault(city, new ArrayList<>());
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<Theatre, List<Show>>();

        for( Theatre theatre : theatres ){
            List<Show> shows = theatre.getShows();
            List<Show> givenMovieShows = new ArrayList<>();

            for( Show show : shows ){
                if( show.getMovie().equals(movie) ){
                    givenMovieShows.add(show);
                }
            }

            if( !givenMovieShows.isEmpty() ){
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }


    public void getAllShowsByCityAndMovie(City city, Movie movie){
        Map<Theatre, List<Show>> allTheatresWithShows = getAllShows(city, movie);

        for( Map.Entry<Theatre, List<Show>> entry : allTheatresWithShows.entrySet() ){
            System.out.println("Theatre Id: " + entry.getKey().getTheatreId() );
            System.out.println("Show Id - Movie Name - ScreenId - Duration");
            for( Show show : entry.getValue() ){
                System.out.println(show.getShowId() + " - " + show.getMovie().getName() + " - " +  show.getScreen().getScreenId() + " - " + show.getTime());
            }
            System.out.println();
        }
    }



}