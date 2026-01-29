package org.joonzis.service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class CrawlingServiceImpl implements CrawlingService{
	
	@Override
	public List<String> doCrawl() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		List<String> list = new ArrayList<String>();
		
		// 명시적 대기를 위한 객체 생성
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String url = "https://www.picturethisai.com/ko/care/Epipremnum_aureum.html";
		
		try {
			
			driver.get(url);
			By targetLocator = By.cssSelector(".care-content");
			wait.until(ExpectedConditions.presenceOfElementLocated(targetLocator));
			List<WebElement> elements = driver.findElements(targetLocator);
			
			for(WebElement ele : elements) {
	            String text = ele.getText().trim();
	            if(!text.isEmpty()) {
	                list.add(text);
	                System.out.println("Crawl data: " + text);
	            }
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(driver != null) {
				driver.quit();
			}
		}
		
		return list;
	}
}

