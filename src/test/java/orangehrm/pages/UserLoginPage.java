package orangehrm.pages;

import orangehrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {
     public UserLoginPage(){
         PageFactory.initElements(Driver.getDriver(), this);
     }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Required']")
    public WebElement usernamePasswordRequiredMessage;


    @FindBy(xpath = "//span[.='Admin']")
    public WebElement adminText;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    public WebElement invalidcredentailsText;


}
