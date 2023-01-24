package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TraineePositionForm extends CreatePositionBase{
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    CreatePositionBase createPositionBase = new CreatePositionBase();
    private String TraineePositionName = createPositionBase.GeneratingPositionName();

    private SelenideElement statusPositionType = $x(".//div[text() = 'New Trainee Position']");

    public String getTraineePositionType() {
        return statusPositionType.getText();
    }

    public void CreateTraineePosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(TraineePositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        TraineePositionForm traineePositionForm = homePage.clickTraineePosition();
        traineePositionForm.clickPriority();
        traineePositionForm.clickUrgentPriority();
        traineePositionForm.enterLocation("Armenia");
        traineePositionForm.clickLocation();
        traineePositionForm.clickRemoteType();
        traineePositionForm.selectRemoteType();
        traineePositionForm.clickDateOfCreation();
        traineePositionForm.selectDateOfCreation();
        traineePositionForm.addComment("Its a good idea");
        traineePositionForm.enterPositionName(TraineePositionName);
        traineePositionForm.clickRole();
        traineePositionForm.selectRole();
        traineePositionForm.clickEnglish();
        traineePositionForm.selectEnglish();
        traineePositionForm.clickButtonSkill();
        traineePositionForm.clickSkill();
        traineePositionForm.selectSkill();
        traineePositionForm.clickGrade();
        traineePositionForm.selectGrade();
        traineePositionForm.clickTabRequests();
        traineePositionForm.clickAddRequest();
        traineePositionForm.clickJobType();
        traineePositionForm.selectJobType();
        traineePositionForm.clickDeadline();
        traineePositionForm.selectDeadline();
        traineePositionForm.addRequiredPeople("3");
        traineePositionForm.buttonCreatePosition();
        Assert.assertTrue(homePage.getTraineePositionInGrid().contains(TraineePositionName), "not success");
    }

}
