package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.driver;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class Homework {
//    Bir class oluşturun: DependsOnTest
//    https://www.amazon.com/ adresine gidin.
//    Test : Amazon ana sayfaya gittiginizi test edin
//    Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
//    arama yapin ve aramanizin gerceklestigini Test edin
//    Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
//    $16.83 oldugunu test edi

    AmazonPage amazonPage = new AmazonPage();
    @Test
    public void test01() {

        //    https://www.amazon.com/ adresine gidin.
        driver.getDriver().get(" https://www.amazon.com/");
        Assert.assertTrue(amazonPage.amazonAnaSayfa.isDisplayed());

    }

    @Test(dependsOnMethods="test01")
    public void test02() {
        //    Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
//    arama yapin ve aramanizin gerceklestigini Test edin
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
//    Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        Assert.assertTrue(amazonPage.aramaSonucWE.isDisplayed());
        amazonPage.nutellaIlkUrun.click();
        amazonPage.seeAllBuyingOtins.click();

//    $16.83 oldugunu test edi
        String expectedPrice=" $16.83";
        String actualPrice=(driver.getDriver().findElement(By.xpath(" //*[@id='aod-price-1']")).getText());
        Assert.assertNotEquals(expectedPrice,actualPrice);

    }
}
