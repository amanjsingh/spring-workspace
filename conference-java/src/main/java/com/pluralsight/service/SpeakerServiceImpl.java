package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    // Generate its Setter for Setter Injection
    private SpeakerRepository repository;

//    For Constructor Injection
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

//    For Setter Injection
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
