package com.traini8.trainingcenters;

import com.traini8.trainingcenters.model.TrainingCenter;
import com.traini8.trainingcenters.service.TrainingCenterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrainingcentersApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(TrainingcentersApplication.class, args);
		System.out.println("Context got created...");
		//TrainingCenterController trainingCenterController= (TrainingCenterController) context.getBean("TrainingCenterController");
		TrainingCenter trainingCenter=(TrainingCenter)context.getBean(TrainingCenter.class);
		trainingCenter.setCenterCode("101A");
		trainingCenter.setCenterName("MIT");
		trainingCenter.setContactEmail("mitcenter@mil.edu");
		trainingCenter.setContactPhone("133445667");
		trainingCenter.setCreatedOn(String.valueOf(Instant.now().toEpochMilli()));
		trainingCenter.setSutudentCapacity(100);

		TrainingCenterService service= (TrainingCenterService) context.getBean(TrainingCenterService.class);
		service.addTrainingCenter(trainingCenter);

		List<TrainingCenter> list=service.getAllTrainingCenters();
		System.out.println("list of all Training ceneter:");
		for(TrainingCenter obj: list)
		{
			System.out.println(obj.toString());
		}

	}

}
