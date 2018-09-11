package ch.elca.springbootexample.repository;

import ch.elca.springbootexample.pojo.Traveller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravellerRepository extends CrudRepository<Traveller, Long> {

    List<Traveller> findAll();
}
