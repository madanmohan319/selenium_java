package Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	
		public static void main(String[] args) throws InterruptedException
		{
		// create a project of chrome driver
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();// manages the windows and maximizes

			driver.get("https://techfynder.com/contractor/signup-contractor-steps");
			
			Thread.sleep(2000);
			
			/// create a variable element 
			
			WebElement element = driver.findElement(By.className("mat-button-wrapper"));
			
			Thread.sleep(2000);
			
			element.click();
			
			Thread.sleep(2000);
			//switch to new window opened
			
			
			WebElement element2 = driver.findElement(By.cssSelector("input[placeholder= 'Type your skills']"));

			element2.sendKeys("testing");

			driver.quit();
			
		}

}
