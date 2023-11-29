package cinema;

import java.util.ArrayList;

public class Cinema {
    private Counter counter;
    private ArrayList<Hall> halls;

    public Cinema(Counter counter, ArrayList<Hall> halls){
        this.counter = counter;
        this.halls = halls;
    }

    public Counter getCounter() {
        return counter;
    }
    public void addMovie(Movie movie){
        counter.addMovie(movie);
    }
}