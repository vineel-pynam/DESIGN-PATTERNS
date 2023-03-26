// THIS FILE IS NOT INCLUDED IN THE CODE.
public class Booking{
    private Integer bookingId;
    private Show show;
    private List<Seat> seatsBooked = new ArrayList<>();

    public Booking() {
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Show getShow() {
        return this.show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeatsBooked() {
        return this.seatsBooked;
    }

    public void setSeatsBooked(List<Seat> seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

}