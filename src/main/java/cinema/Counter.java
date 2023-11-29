package cinema;

import java.util.ArrayList;


public class Counter {
    private ArrayList<Movie> movies;

    public Counter(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void buyATicket(Movie movie, Person person) {
        if (person.getMoney() - movie.getCostOfScreening() >= 0) {
            if (movie.isBoughtATicket(person)) {
                person.setMoney(person.getMoney() - movie.getCostOfScreening());
            }
        }
    }
}