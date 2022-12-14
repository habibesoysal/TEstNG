package tests.automatıonExercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.driver;

public class Example7 {
    AutomationExercisePage automationExerciseObje = new AutomationExercisePage();

    @Test
    public void test01() {

//2. 'http://automationexercise.com' url'sine gidin
        driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
//            3. Ana sayfanın başarıyla görünür olduğunu doğrulayın

        String istenilenUrL="https://www.automationexercise.com/";
        String gercekUrL=driver.getDriver().getCurrentUrl();
        Assert.assertEquals(istenilenUrL,gercekUrL);

//4. 'Test Vakaları' düğmesine tıklayın
        automationExerciseObje.testCases.click();

//5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın

        String actualUrl = driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/test_cases";
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.closeDriver();

    }
}
