package Login;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ClientPositionForm;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class ValidationFields {

    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();

    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

    @Test
    public void CreatePosition(){

        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.clickCreateButton();
        ClientPositionForm clientPositionForm = homePage.clickClientProjectPosition();
        clientPositionForm.addComment("Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good idea Its a good ideaa");
        Assert.assertTrue(clientPositionForm.getCommentMassage().contains("Ensure this filed has no more then 511 characters"), "not success");


    }
}
