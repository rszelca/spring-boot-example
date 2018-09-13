package com.rszelca.springbootexample.service;

import com.rszelca.springbootexample.pojo.Tour;
import com.rszelca.springbootexample.repository.TourRepository;
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

//    public void save(Tour t) {
//        tourRepo.save(t);
//    }
//
//    public void delete(Tour t) {
//        tourRepo.delete(t);
//    }

}
