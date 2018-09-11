package ch.elca.springbootexample.service;

import ch.elca.springbootexample.pojo.Tour;
import ch.elca.springbootexample.repository.TourRepository;
import ch.elca.springbootexample.repository.TravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravellerService {

    private TravellerRepository travellerRepo;

    @Autowired
    public void setTravellerRepo(TravellerRepository travellerRepo) {
        this.travellerRepo = travellerRepo;
    }

}
