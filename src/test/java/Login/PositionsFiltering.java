package Login;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class PositionsFiltering {
    SoftAssert softAssert = new SoftAssert();
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();

    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

    @Test
    public void FilteringByType() throws Exception{
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickFilteringByType();
        homePage.selectFilteringByBenchLabel();
        //homePage.selectFilteringByTraineeLabel();
        homePage.clickOkButton();
        //Assert.assertTrue(homePage.getAllPositions().contains("Bench"), "not success");

        homePage.getAllPositions().forEach(label -> softAssert.assertTrue(label));
        softAssert.assertAll();
    }

}
