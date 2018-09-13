package com.rszelca.springbootexample.repository;

import com.rszelca.springbootexample.pojo.Traveller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravellerRepository extends CrudRepository<Traveller, Long> {

    List<Traveller> findAll();
}
