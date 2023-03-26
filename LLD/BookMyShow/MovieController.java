import java.util.*;
import enums.*;

public class MovieController{
    Map<City, List<Movie>> cityToMovies;
    List<Movie> allMovies;

    public MovieController(){
        cityToMovies = new HashMap<City, List<Movie>>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie){
        List<Movie> movies = cityToMovies.getOrDefault(city, new ArrayList());
        movies.add(movie);
        cityToMovies.put(city, movies);
        allMovies.add(movie);
    }


    public List<Movie> getMoviesByCity(City city){
        return cityToMovies.getOrDefault(city, new ArrayList());
    }

    public Movie getMovieByName(String movieName){
        for( Movie movie : allMovies ){
            if( movie.getName().equalsIgnoreCase(movieName) ){
                return movie;
            }
        }

        return null;
    }



}