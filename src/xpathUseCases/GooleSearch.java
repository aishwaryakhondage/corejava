package xpathUseCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooleSearch {

	public static void main(String[] args) {
		
         WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
          
	     driver.findElement(By.name("q")).sendKeys("java");
	     driver.findElement(By.partialLinkText("//div[@class='UUbT9']")).getText();
	     
     
	}
}
	
	
	