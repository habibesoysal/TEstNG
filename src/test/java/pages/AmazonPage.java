package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(driver.getDriver(), this);

    }
        @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

    @FindBy(xpath = "//html")
    public WebElement amazonAnaSayfa;
@FindBy(xpath = "(//span[@class='a-size-base a-color-base a-text-normal'])[1]")
    public WebElement nutellaIlkUrun;

    @FindBy(xpath = "//*[@title='See All Buying Options']")
    public WebElement seeAllBuyingOtins;



    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
}



