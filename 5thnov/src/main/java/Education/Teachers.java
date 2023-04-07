package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {
	
	@FindBy(xpath="//input[@class=\"field blur-on-esc\"]") 
	private WebElement emailid;

	
	@FindBy(xpath="//input[@id=\"add-coach\"]") 
	private WebElement addteacher;

	public Teachers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void emailid() {
		emailid.sendKeys("abc@yopmail.com");
	}
	
	public void addteacher() {
		addteacher.click();		
	}
}
