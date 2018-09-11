package ch.elca.springbootexample.repository;

import ch.elca.springbootexample.pojo.Tour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TourRepository extends CrudRepository<Tour, Long> {

    List<Tour> findAll();

    Tour findFirstByOrderByCreatedOnDesc();
}
