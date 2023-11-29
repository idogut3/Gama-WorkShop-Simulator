package cinema;

public class Hall {
    private final int HALL_CAPACITY;
    private FilmReel filmReel;
    private int placesLeft;

    public Hall(int hallCapacity) {
        HALL_CAPACITY = hallCapacity;
        this.filmReel = new FilmReel();
        this.placesLeft = HALL_CAPACITY;
    }
    public void screenMovie(Movie movie){
        filmReel.screenMovie(movie);
        this.placesLeft = HALL_CAPACITY;
    }

    public void setAnyPlaceLeft(int placeLeft) {
        this.placesLeft = placeLeft;
    }

    public int getPlacesLeft() {
        return placesLeft;
    }

    public boolean anyPlaceLeft(){
        return placesLeft <= HALL_CAPACITY;
    }

}
