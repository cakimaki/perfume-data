package org.example.notinoapp;

import org.example.notinoapp.service.PerfumeScraperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotinoAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NotinoAppApplication.class, args);
		{
			PerfumeScraperService perfumeScraperService = new PerfumeScraperService();
			
			perfumeScraperService.scrapePerfumeData();
		}
	}
	
}
