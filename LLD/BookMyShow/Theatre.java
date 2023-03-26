import java.util.*;

public class Theatre{
    private int theatreId;
    List<Screen> screens;
    List<Show> shows;

    public Theatre() {
    }


    public int getTheatreId() {
        return this.theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public List<Screen> getScreens() {
        return this.screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return this.shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

}