package cinema;

import java.util.ArrayList;


public class Movie {
    private String name;
    private Hall hall;
    private int costOfScreening;
    private Date date;

    public Movie(String name, Hall hall, int cost, Date date){
        this.name = name;
        this.hall = hall;
        this.costOfScreening = cost;
        this.date = date;
    }
    public boolean isAnyTicketsLeft(){
       return hall.anyPlaceLeft();
    }

    public String getName() {
        return name;
    }
    public boolean isBoughtATicket(Person person){
        if (hall.anyPlaceLeft()){
            hall.setAnyPlaceLeft(hall.getPlacesLeft() - 1);
            System.out.println("Successfully bought a ticket");
            return true; //Bought a ticket
        }
        System.out.println("Sorry We don't have a place for this movie");
        return false;
    }

    public int getCostOfScreening() {
        return costOfScreening;
    }
}
