package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PreOfferPositionForm extends CreatePositionBase{
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    CreatePositionBase createPositionBase = new CreatePositionBase();
    private String PreOfferPositionName = createPositionBase.GeneratingPositionName();

    private SelenideElement statusPositionType = $x(".//div[text() = 'New Pre-offer Position']");

    public String getNamePreOfferPositionType() {
        return statusPositionType.getText();
    }

    public void CreatePreOfferPosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(PreOfferPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        PreOfferPositionForm preOfferPositionForm = homePage.clickPreOfferPosition();
        preOfferPositionForm.clickPriority();
        preOfferPositionForm.clickUrgentPriority();
        preOfferPositionForm.enterLocation("Armenia");
        preOfferPositionForm.clickLocation();
        preOfferPositionForm.clickRemoteType();
        preOfferPositionForm.selectRemoteType();
        preOfferPositionForm.clickDateOfCreation();
        preOfferPositionForm.selectDateOfCreation();
        preOfferPositionForm.addComment("Its a good idea");
        preOfferPositionForm.enterPositionName(PreOfferPositionName);
        preOfferPositionForm.clickRole();
        preOfferPositionForm.selectRole();
        preOfferPositionForm.clickEnglish();
        preOfferPositionForm.selectEnglish();
        preOfferPositionForm.clickButtonSkill();
        preOfferPositionForm.clickSkill();
        preOfferPositionForm.selectSkill();
        preOfferPositionForm.clickGrade();
        preOfferPositionForm.selectGrade();
        preOfferPositionForm.clickTabRequests();
        preOfferPositionForm.clickAddRequest();
        preOfferPositionForm.clickJobType();
        preOfferPositionForm.selectJobType();
        preOfferPositionForm.clickDeadline();
        preOfferPositionForm.selectDeadline();
        preOfferPositionForm.addRequiredPeople("3");
        preOfferPositionForm.buttonCreatePosition();
        Assert.assertTrue(homePage.getPreOfferPositionInGrid().contains(PreOfferPositionName), "not success");
    }
}
