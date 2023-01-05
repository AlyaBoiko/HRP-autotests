package Login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();

    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

//    @BeforeMethod
//    private void setupEach(){
//        open("https://stage.hrportal.akvelon.net/");
//        loginPage.fillLoginField("alevtina.boik@akvelon.com");
//    }


    @Test
    public void testWrongLogin() {
        String note = "No active account found with the given credentials";


        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boik@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        loginPage.checkErrorMsg(note);
    }

    @Test(priority = 1)
    public void testWrongPassword() {
        String note = "No active account found with the given credentials";


        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!")
                .clickSubmit();
        loginPage.checkErrorMsg(note);
    }

    @Test
    public void testWrongCred() {
        String note = "No active account found with the given credentials";


        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boik@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!")
                .clickSubmit();
        loginPage.checkErrorMsg(note);
    }

    @Test
    public void testCorrectCred() {

        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit().checkPositionTitleVisible();
    }
}
