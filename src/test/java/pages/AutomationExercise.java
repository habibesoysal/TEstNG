package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

public class AutomationExercise {
    public AutomationExercise() {
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy(xpath = "//html")
    public WebElement automationExerciseAnaSayfa;
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement kayitOlGirisYap;
    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement kayitOlName;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement kayitOlEmail;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement cinsiyetMr;
    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement cinsiyetMrs;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement hesapOlusturuldu;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[@class='fa fa-user']")
    public WebElement oturumAcıldı;
    @FindBy(xpath = "   (//*[@class='fa fa-shopping-cart'])[6]")
    public WebElement elbisEkle;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement sepetSayfasi;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement odemeyeDevamEt;
    @FindBy(xpath = "//*[@id='address_delivery']")
    public WebElement teslimatAdresi;
    @FindBy(xpath = "//*[@id='address_invoice']")
    public WebElement faturaAdresi;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement hesapSil;



    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement onerilenUrunler;

    @FindBy(xpath = "(//*[@data-product-id='2'])[3]")
    public WebElement onerilenUrunlerdeSepeteEkle;

    @FindBy(xpath = "//*[@class='cart_description']")
    public WebElement sepettekiUrun;
}