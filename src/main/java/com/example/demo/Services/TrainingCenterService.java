package com.example.demo.Services;

import com.example.demo.Model.TrainingCenter;
import com.example.demo.Repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {
    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    // Save Training Center
    public TrainingCenter saveTrainingCenter(TrainingCenter center) {
        center.setCreatedOn(Instant.now().getEpochSecond()); // Set the server timestamp
        return repository.save(center);
    }

    // Get filtered list of training centers
    public List<TrainingCenter> getFilteredTrainingCenters(String city, String state, Integer capacity, String course) {
        return repository.findFiltered(city, state, capacity, course);
    }


}
