package com.rszelca.springbootexample.controller;

import com.rszelca.springbootexample.service.TourService;
import com.rszelca.springbootexample.service.TravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

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

    //TODO i18n
    @RequestMapping("/tours")
    public String tours(Model model) {
        model.addAttribute("tours", tourService.getTours());
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMM.yyyy");
        model.addAttribute("serverTime", sdf.format(new Date()));
        return "tours";
    }
    @RequestMapping("/tour")
    public String tour() {
        return "tour";
    }

    //TODO add tour

}
