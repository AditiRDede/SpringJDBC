package com.traini8.trainingcenters.Controller;

import com.traini8.trainingcenters.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;

public class TrainingCenterController
{
    private final TrainingCenterService trainingCenterService;

    @Autowired
    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }
}
