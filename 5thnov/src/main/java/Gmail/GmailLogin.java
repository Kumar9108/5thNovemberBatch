package Gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLogin {

	@FindBy(xpath="//a[@aria-label=\"Gmail (opens a new tab)\"]") private WebElement gmailclick;
	
	@FindBy(xpath="//a[@data-action=\"sign in\"]") private WebElement signclick;
	
//	@FindBy(xpath="//a[@data-action=\"sign in\"]") private WebElement signclick;
	
//	@FindBy(xpath="//a[@data-action=\"sign in\"]") private WebElement signclick;
	
}
