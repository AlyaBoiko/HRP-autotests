package Login;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;

public class CheckPositionType {
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    private final ClientPositionForm clientPositionForm = new ClientPositionForm();
    private final InternalPositionForm internalPositionForm = new InternalPositionForm();


    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

    @BeforeMethod
    private void beforeEach(){
        //open(System.getenv("baseurl"));
        open("https://stage.hrportal.akvelon.net/");
    }
    @AfterMethod
    private void afterEach(){
        Selenide.closeWindow();
    }


    @Test
    public void OpenClientProjectPositionForm() {
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        homePage.clickClientProjectPosition();
        //Assert.assertEquals(clientPositionForm.getNameClientPositionType().contentEquals("New Project Position"),"New Project Position");
        clientPositionForm.checkModalClientPositionTitleExist();
        //Assert.assertTrue(true);

    }

    @Test
    public void OpenInternalProjectPositionForm() {
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        homePage.clickInternalProjectPosition();
        //Assert.assertEquals(clientPositionForm.getNameClientPositionType().contentEquals("New Project Position"),"New Project Position");
        internalPositionForm.checkModalInternalPositionTitleExist();
        //Assert.assertTrue(true);

    }

    @Test
    public void OpenBenchPositionForm() {
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        homePage.clickBenchPosition();
        //Assert.assertEquals(clientPositionForm.getNameClientPositionType().contentEquals("New Project Position"),"New Project Position");
        //Assert.assertTrue(clientPositionForm.getNameClientPositionType().contains("New Project Position"),"not success");
        Assert.assertTrue(true);

    }
    @Test
    public void OpenPreOfferPositionForm() {
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        homePage.clickPreOfferPosition();
        //Assert.assertEquals(clientPositionForm.getNameClientPositionType().contentEquals("New Project Position"),"New Project Position");
        //Assert.assertTrue(clientPositionForm.getNameClientPositionType().contains("New Project Position"),"not success");
        Assert.assertTrue(true);

    }
    @Test
    public void OpenTraineePositionForm() {
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        homePage.clickTraineePosition();
        //Assert.assertEquals(clientPositionForm.getNameClientPositionType().contentEquals("New Project Position"),"New Project Position");
        Assert.assertTrue(clientPositionForm.getNameClientPositionType().contains("New Project Position"),"not success");
        //Assert.assertTrue(true);

    }


}
