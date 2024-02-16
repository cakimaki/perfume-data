package org.example.notinoapp.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JsonScraper {
	
	// Set path to chromedriver executable
	void scrapePerfumeJsonData() {
		System.setProperty("chromedriver.exe", "C:/Users/Yordan/Documents/GitHub/perfume-data/chromedriver.exe");
		
		// Initialize WebDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run in headless mode (no browser UI)
		WebDriver driver = new ChromeDriver(options);
		
		// Navigate to the webpage
		driver.get("https://www.notino.bg/montale/dark-purple-parfjumna-voda-za-...");
		
		// Extract JSON-LD data
		WebElement scriptElement = driver.findElement(By.xpath("//script[@type='application/ld+json']"));
		String jsonLdContent = scriptElement.getAttribute("innerHTML").trim();
		
		System.out.println(jsonLdContent);
		
		// Parse the JSON-LD content with a JSON parsing library like Jackson or Gson
		
		// Clean up
		driver.quit();
	}
}