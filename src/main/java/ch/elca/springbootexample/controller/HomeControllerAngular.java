package ch.elca.springbootexample.controller;

import ch.elca.springbootexample.pojo.Tour;
import ch.elca.springbootexample.service.TourService;
import ch.elca.springbootexample.service.TravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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