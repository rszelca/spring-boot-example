package com.rszelca.springbootexample.controller;

import com.rszelca.springbootexample.pojo.Tour;
import com.rszelca.springbootexample.service.TourService;
import com.rszelca.springbootexample.service.TravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class HomeControllerAngular {
    private TourService tourService;
    private TravellerService travellerService;

    @Autowired
    public void setTourService(TourService tourService) {
        this.tourService = tourService;
    }

    @Autowired
    public void setTravellerService(TravellerService travellerService) {
        this.travellerService = travellerService;
    }

    @GetMapping()
    public List<Tour> getTours(){
        return tourService.getTours();
    }

    @GetMapping(path = {"/{id}"})
    public Tour getTourById(@PathVariable("id") int id){
        // TODO implement it
        return new Tour("destination, not implemented", "exp. , not implemented", 5);
    }

}