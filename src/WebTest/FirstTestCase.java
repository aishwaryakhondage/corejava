package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
        System.out.println("Application tittle: "+driver.getTitle());

          driver.close();
          
	}
}