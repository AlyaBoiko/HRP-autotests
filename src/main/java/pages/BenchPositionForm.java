package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BenchPositionForm extends CreatePositionBase{
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    CreatePositionBase createPositionBase = new CreatePositionBase();
    private String BenchPositionName = createPositionBase.GeneratingPositionName();
    private SelenideElement statusPositionType = $x(".//div[text() = 'New Bench Position']");

    public String getNameBenchPositionType() {
        return statusPositionType.getText();
    }

    public void CreateBenchPosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(BenchPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        BenchPositionForm benchPositionForm = homePage.clickBenchPosition();
        benchPositionForm.clickPriority();
        benchPositionForm.clickUrgentPriority();
        benchPositionForm.enterLocation("Armenia");
        benchPositionForm.clickLocation();
        benchPositionForm.clickRemoteType();
        benchPositionForm.selectRemoteType();
        benchPositionForm.clickDateOfCreation();
        benchPositionForm.selectDateOfCreation();
        benchPositionForm.addComment("Its a good idea");
        benchPositionForm.enterPositionName(BenchPositionName);
        benchPositionForm.clickRole();
        benchPositionForm.selectRole();
        benchPositionForm.clickEnglish();
        benchPositionForm.selectEnglish();
        benchPositionForm.clickButtonSkill();
        benchPositionForm.clickSkill();
        benchPositionForm.selectSkill();
        benchPositionForm.clickGrade();
        benchPositionForm.selectGrade();
        benchPositionForm.clickTabRequests();
        benchPositionForm.clickAddRequest();
        benchPositionForm.clickJobType();
        benchPositionForm.selectJobType();
        benchPositionForm.clickDeadline();
        benchPositionForm.selectDeadline();
        benchPositionForm.addRequiredPeople("3");
        benchPositionForm.buttonCreatePosition();
        Assert.assertTrue(homePage.getBenchPositionInGrid().contains(BenchPositionName), "not success");

    }
}
