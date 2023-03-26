import java.util.*;

public class Show{
    private int showId;
    private Movie movie;
    private Screen screen;
    private int time;
    List<Integer> bookedId = new ArrayList<>();

    public Show() {
    }

    public Show(int showId, Movie movie, Screen screen, int time) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.time = time;
    }



    public int getShowId() {
        return this.showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return this.screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Integer> getBookedId() {
        return this.bookedId;
    }

    public void setBookedId(List<Integer> bookedId) {
        this.bookedId = bookedId;
    }
    


}