package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

public class FacebookPage {
    public FacebookPage() {

        PageFactory.initElements(driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement girişYap;

    @FindBy(xpath = "//*[@id='loginbutton']")
    public WebElement hatalıGirişYap;




}