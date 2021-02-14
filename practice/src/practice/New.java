package practice;

public class New {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();// manages the windows and maximizes

		driver.get("https://testzenlabs.ie/");// open the website
		
		Actions action = new Actions(driver);

		List<WebElement> element1 = driver.findElements(By.cssSelector(".menu-item-9221"));

		Thread.sleep(2000);

		action.moveToElement(element1.get(1)).build().perform();

		Thread.sleep(2000);

		WebElement element2 = driver.findElement(By.linkText("Quality Transformation Services"));

		Thread.sleep(2000);

		element2.click();

		driver.quit();// TODO Auto-generated method stub

	}

}
