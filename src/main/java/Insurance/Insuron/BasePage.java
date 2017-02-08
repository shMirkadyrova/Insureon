package Insurance.Insuron;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 class BasePage {
	
	public static WebDriver driver;
	BasePage()
	{
		if (driver==null){
			System.setProperty("webdriver.chrome.driver","C:\\Jar\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://www.insureon.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	}
	public void waitForElement(WebDriver driver, By e)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(e));
	}
}
