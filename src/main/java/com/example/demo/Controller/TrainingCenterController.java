package com.example.demo.Controller;

import com.example.demo.Model.TrainingCenter;
import com.example.demo.Services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    // POST method to create training center
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
        TrainingCenter savedCenter = service.saveTrainingCenter(center);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    // GET method with filters
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) Integer capacity,
            @RequestParam(required = false) String course
    ) {
        List<TrainingCenter> centers = service.getFilteredTrainingCenters(city, state, capacity, course);
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }

}