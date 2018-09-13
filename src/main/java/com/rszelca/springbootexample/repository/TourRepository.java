package com.rszelca.springbootexample.repository;

import com.rszelca.springbootexample.pojo.Tour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TourRepository extends CrudRepository<Tour, Long> {
    @Override
    List<Tour> findAll();

    @Override
    <S extends Tour> S save(S s);

    @Override
    void delete(Tour tour);

    Tour findFirstByOrderByCreatedOnDesc();
}
