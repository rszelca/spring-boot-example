package ch.elca.springbootexample.service;

import ch.elca.springbootexample.pojo.Tour;
import ch.elca.springbootexample.repository.TourRepository;
import ch.elca.springbootexample.repository.TravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

    private TourRepository tourRepo;

    @Autowired
    public void setTourRepo(TourRepository tourRepo) {
        this.tourRepo = tourRepo;
    }

    public Tour getTourRepo() {
        return tourRepo.findFirstByOrderByCreatedOnDesc();
    }

    public List<Tour> getTours() {
        return tourRepo.findAll();
    }


}
