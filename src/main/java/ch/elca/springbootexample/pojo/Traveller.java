package ch.elca.springbootexample.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Traveller extends BasicFields {

    private static final long serialVersionUID = 3246747235324743688L;

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
    //TODO Test, if I delete it, it should not delete in booth way?   mappedBy = "traveller" create an exception "SyntaxError: JSON.parse: unexpected end of data at line 1 column 167797 of the JSON data"
//    @OneToMany(mappedBy = "traveller", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tour> tours;
    private String nick;
    private int age;
    //TODO create enum Gender gender;


    public Traveller() {
    }

    public Traveller(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "id=" + id +
                ", tours=" + tours +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traveller traveller = (Traveller) o;
        return age == traveller.age &&
                Objects.equals(id, traveller.id) &&
                Objects.equals(tours, traveller.tours) &&
                Objects.equals(nick, traveller.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tours, nick, age);
    }
}
