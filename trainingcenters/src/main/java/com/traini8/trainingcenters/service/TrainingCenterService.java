package com.traini8.trainingcenters.service;
import com.traini8.trainingcenters.Repository.TrainingCenterRepository;
import com.traini8.trainingcenters.model.TrainingCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class TrainingCenterService
{
    private final TrainingCenterRepository trainingCenterRepository;

    @Autowired
    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    public void addTrainingCenter(TrainingCenter trainingCenter)
    {
        System.out.println("call to repo");
        trainingCenterRepository.save(trainingCenter);

    }
    public List<TrainingCenter> getAllTrainingCenters()
    {
        return trainingCenterRepository.findAll();
    }
}
