package com.rszelca.springbootexample.service;

import com.rszelca.springbootexample.repository.TravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravellerService {

    private TravellerRepository travellerRepo;

    @Autowired
    public void setTravellerRepo(TravellerRepository travellerRepo) {
        this.travellerRepo = travellerRepo;
    }

}
