import cinema.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person(100, "Dave");
        Date date = new Date("20:00");

        ArrayList<Hall> halls = new ArrayList<>();
        Hall hall1 = new Hall(50);
        Hall hall2 = new Hall(50);
        Hall hall3 = new Hall(50);

        halls.add(hall1);
        halls.add(hall2);
        halls.add(hall3);

        ArrayList<Movie> movies = new ArrayList<>();
        Counter counter = new Counter(movies);
        Cinema cinema = new Cinema(counter, halls);

        Movie movie = new Movie("Titanic", hall1,40 , date);
        Movie movie2 = new Movie("Titanic", hall1,40 , date);
        Movie movie3 = new Movie("Titanic", hall1,40 , date);
        cinema.addMovie(movie);
        cinema.addMovie(movie3);
        cinema.addMovie(movie2);

        cinema.getCounter().buyATicket(movie, person);


    }
}
