package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeTesting {
	
	WebDriver driver;
	
	@BeforeClass public void beforeclass() {
		
	    driver=new ChromeDriver();
		driver.get("chrome://newtab");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@BeforeMethod public void beforemethod() {
		
		driver.get("https://www.youtube.com/");
		
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		if(url.equals(title)) 
//			System.out.println("Correct title");
//		else
//			System.out.println("Wrong title");
		
		}
	
	@Test public void to_verify_search_tab() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]")).click();
//		Thread.sleep(5000);
		System.out.println("Hello 1");	
	}
//	
//	@Test public void to_verify_video_playing() {
//		
//	    driver.findElement(By.xpath("//a[@title=\"What Is Selenium? | Selenium Webdriver Basics | Selenium Tutorial For Beginners | Simplilearn\"]")).click();
//		
//	}
	
	/*
   @Test public void to_verify_pause_video() {
		
		driver.findElement(By.xpath("//video[@class=\"video-stream html5-main-video\"]")).click();
	
   }
	
   @Test public void to_verify_full_screen() {
		
	    driver.findElement(By.xpath("//button[@class=\"ytp-fullscreen-button ytp-button\"]")).click();

   }
   
   @Test public void to_verify_exit_full_screen() {
		
	    driver.findElement(By.xpath("//button[@class=\"ytp-fullscreen-button ytp-button\"]")).click();
	
   }
/*
   @Test public void to_verify_return_home() {
		
	
   }
 */  
   @Test public void to_verify_play_reels() {
		
	   driver.findElement(By.xpath("//a[@title=\"Shorts\"][1]")).click();
	
   }
 
    @AfterMethod public void aftermethod() {
    	
    	driver.findElement(By.xpath("//a[@title=\"YouTube Home\"][1]")).click();
//    	driver.get("chrome://newtab");
		
	}

	@AfterClass public void afterclass() {
		
		driver.close();
	}
}
