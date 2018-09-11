package ch.elca.springbootexample.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Tour extends BasicFields {

    private static final long serialVersionUID = 3246747235324743689L;

    //TODO something is wrong with the generated ID value, if you remove the ID from data.sql
    @GeneratedValue
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    private Traveller traveller;
    private String destination;
    @Column(columnDefinition = "TEXT")
    private String experience;
    private int rating;

    public Tour() {
    }

    public Tour(String destination, String experience, int rating) {
        this.destination = destination;
        this.experience = experience;
        this.rating = rating;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }

    //TODO ask senior, how can I take into the toString the extended class's variables
    @Override
    public String toString() {
        return "Tour{" +
                "destination='" + destination + '\'' +
                ", experience='" + experience + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tour tour = (Tour) o;

        if (rating != tour.rating) return false;
        if (!id.equals(tour.id)) return false;
        if (traveller != null ? !traveller.equals(tour.traveller) : tour.traveller != null) return false;
        if (destination != null ? !destination.equals(tour.destination) : tour.destination != null) return false;
        return experience != null ? experience.equals(tour.experience) : tour.experience == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (traveller != null ? traveller.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + rating;
        return result;
    }
}
