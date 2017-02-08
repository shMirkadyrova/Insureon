package Insurance.Insuron;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class QuoteInsureon extends BasePage {
	QuoteInsureon()
	{
		super();
	}
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Quote | Insureon", "Title is not correct" );
	}
public void setZipCode(String ZipCode) throws InterruptedException
{
	    Actions act = new Actions(driver);
	    Action typeKey = act.moveToElement(driver.findElement(By.id("q-v-1-0"))).click().sendKeys(ZipCode).build();
		typeKey.perform();
	  
	   
	    
}
public void setCompanyName(String CompanyName)
{
	driver.findElement(By.id("q-v-1-2")).sendKeys(CompanyName);
}
public void clickNext()
{
	driver.findElement(By.id("img_next")).click();
}
public void selectCompanyType(String ComponyType) throws InterruptedException
{
	if(ComponyType.equalsIgnoreCase("General Liability and Business Property"))
	{
		
		waitForElement(driver,By.cssSelector(".content.bit_checkbox"));
		Thread.sleep(3000);
		List <WebElement> options = driver.findElement(By.cssSelector(".content.bit_checkbox")).findElements(By.tagName("input"));
		options.get(0).click();
		//driver.findElement(By.xpath("id('q-5')")).click();
		clickNext();
	}
}
public void setStartDate(String Date)
{
	driver.findElement(By.id("q-10")).sendKeys(Date);
}
public void setEmployeeCount(String EmployeeCount)
{
	driver.findElement(By.id("q-12")).sendKeys(EmployeeCount);
}
public void setOwnerCount(String OwnerCount)
{
	driver.findElement(By.id("q-13")).sendKeys(OwnerCount);
}
public void setPayroll(String Payroll)
{
	driver.findElement(By.id("q-15")).sendKeys(Payroll);
}
public void setOwnerPayroll(String OwnerPayroll)
{
	driver.findElement(By.id("q-16")).sendKeys(OwnerPayroll);
}
public void setSubContracting(String SubContract)
{
	if(SubContract.equalsIgnoreCase("No"))
	{
		driver.findElement(By.id("q-17-False")).click();
	}
	else
	{
		driver.findElement(By.id("q-17-True")).click();
	}
}

public void setFirstName(String FirstName)
{
	driver.findElement(By.id("q-v-4-1")).sendKeys(FirstName);
}
public void setLastName(String LastName)
{
	driver.findElement(By.id("q-v-4-2")).sendKeys(LastName);
}
public void selectIfOwner(String IfOwner)
{
	if (IfOwner.equalsIgnoreCase(IfOwner))
	{
		
		driver.findElement(By.id("q-v-4-3")).click();
	}
}
public void setContactPhoneNumber(String PhoneNumber)
{
	driver.findElement(By.id("q-v-4-5")).sendKeys(PhoneNumber);
}
public void setEmail(String Email)
{
	driver.findElement(By.id("q-v-4-6")).sendKeys("shmirkadyrova@gmail.com");
}
public void setInsuranceStartDate(String Date)
{
	driver.findElement(By.id("q-v-4-8")).sendKeys(Date);
}
public String getQuoteUpdate()
{
	return driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/div[2]/div/div[1]")).getText();
}
public boolean isQuoteLinkPresent()
{
	return driver.findElement(By.linkText("NetQuote")).isDisplayed();
	
	
}
}



