package orangehrm.pages;

import orangehrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@role='presentation' and @class='oxd-icon oxd-menu-icon']")
    public WebElement searchIkon;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[text()='Performance']")
    public WebElement performanceText;


    @FindBy(xpath = "//span[text()='Time']")
    public WebElement timeText;

    @FindBy(xpath = "//ul[@class='oxd-main-menu']")
    public WebElement emptyMenu;





    }

