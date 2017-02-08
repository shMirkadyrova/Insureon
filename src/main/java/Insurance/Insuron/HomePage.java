package Insurance.Insuron;





import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
HomePage()
{
	super();

}
public void navigateToSmallBusiness()
{
	driver.findElement(By.linkText("Small Business Insurance")).click();
}

public String getTittle()
{
	return driver.getTitle();
}

public  void selectIndustry(String Industry) throws InterruptedException
{    
	    Select option = new Select(driver.findElement(By.cssSelector(".form-control.select-industries")));
		option.selectByIndex(4);
}
public void selectService(String Service)
{
	Select opt = new Select(driver.findElement(By.cssSelector(".form-control.select-services")));
	opt.selectByIndex(3);
}
public void clickGetFreeQuotesButton()
{
	driver.findElement(By.className("QuoteButton")).click();
}
}
