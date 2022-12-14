package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.driver;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] aranacakKelimeler() {
        Object[][] arananKElime = {{"java"}, {"selenium"}, {"samsung"}, {"iphone"}};
        return arananKElime;
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.closeDriver();

    }
}