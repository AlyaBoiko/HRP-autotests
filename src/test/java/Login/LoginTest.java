package Login;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();


    @Test
    public void testWrongLogin() {
        String note = "No active account found with the given credentials";


        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boik@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        loginPage.checkErrorMsg(note);
    }

    @Test
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
        String note1 = "Positions";

        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.checkSuccessLogin(note1);
    }
}
