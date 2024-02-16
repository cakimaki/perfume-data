package org.example.notinoapp.service;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PerfumeScraperService {
	
	public void scrapePerfumeData() {
		System.setProperty("chromedriver.exe", "C:/Users/Yordan/Documents/GitHub/perfume-data/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.notino.bg/tom-ford/eau-de-soleil-blanc-toaletna-voda-uniseks/");
			
			// Assuming the perfume details are in elements identified by specific classes
			List<WebElement> perfumeNames = driver.findElements(By.className("perfume-name"));
			List<WebElement> perfumePrices = driver.findElements(By.className("perfume-price"));
			List<WebElement> perfumeVolumes = driver.findElements(By.className("perfume-volume"));
			
			for (int i = 0; i < perfumeNames.size(); i++) {
				String name = perfumeNames.get(i).getText();
				String price = perfumePrices.get(i).getText();
				String volume = perfumeVolumes.get(i).getText();
				System.out.println("Name: " + name + ", Price: " + price + ", Volume: " + volume);
				// Here you can further process the data, save it to a database, etc.
			}
		} finally {
			driver.quit(); // Make sure to close the driver
		}
	}
}
