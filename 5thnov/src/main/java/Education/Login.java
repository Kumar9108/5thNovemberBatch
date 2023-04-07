package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 
	 
	// step 1 To declare DM (Variable) globally master
	
	@FindBy(xpath="//a[@id='login-or-signup']") 
	private WebElement loginlink;
	
	@FindBy(xpath="//input[@id='uid-login-form-2-wb-id-identifier-field']") 
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-3-wb-id-field']") 
	private WebElement passWord;
	
	@FindBy(xpath="//button[@role='button']") 
	private WebElement loginButton;
	
	
	// Step 2 Initialization of Variable or DM
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// step 3 Method create
	
	public void loginLink() {
		loginlink.click();
		
	}
	public void userName() {
		userName.sendKeys("Abhinavvelocity");
	}

	public void passWord() {
		passWord.sendKeys("Abhi@1804");
	}

	public void loginButton() {
        loginButton.click();	
	}


}
