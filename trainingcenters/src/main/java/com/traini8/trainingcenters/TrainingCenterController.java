package com.traini8.trainingcenters;

import com.traini8.trainingcenters.model.TrainingCenter;
import com.traini8.trainingcenters.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class TrainingCenterController
{
    private final TrainingCenterService trainingCenterService;

    @Autowired
    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }

   public void addTrainingCenter(TrainingCenter trainingCenter)
   {
       trainingCenterService.addTrainingCenter(trainingCenter);
   }
}
