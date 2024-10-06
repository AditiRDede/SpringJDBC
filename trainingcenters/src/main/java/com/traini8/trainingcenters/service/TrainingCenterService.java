package com.traini8.trainingcenters.service;
import com.traini8.trainingcenters.Repository.TrainingCenterRepository;
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

    public void addTrainingCenter()
    {
        trainingCenterRepository.save();
        System.out.println("call to repo");
    }
    public List<String> getAllTrainingCenters()
    {
        return trainingCenterRepository.findAll();
    }
}
