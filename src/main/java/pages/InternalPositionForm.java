package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.nio.charset.Charset;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class InternalPositionForm extends CreatePositionBase{

    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    CreatePositionBase createPositionBase = new CreatePositionBase();
    private String InternalPositionName = createPositionBase.GeneratingPositionName();

    private SelenideElement statusPositionType = $x(".//div[text() = 'New Internal Project Position']");
    private SelenideElement fieldProject = $x(".//input[@id='project']");
    private SelenideElement findProject = $x(".//div[@class='rc-virtual-list-holder-inner']/descendant::div[@title='AETS']");


    public void clickProject()
    {
        fieldProject.click();
    }
    public void findProject()
    {
        findProject.click();
    }


    public String getNameInternalPositionType() {
        return statusPositionType.getText();
    }

    public InternalPositionForm checkModalInternalPositionTitleExist() {
        //statusPositionType.should(Condition.visible);
        //System.out.println(statusPositionType.is(Condition.visible));
        statusPositionType.shouldBe(Condition.visible);
        return this;
    }

    public void CreateInternalProjectPosition(){
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(InternalPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        InternalPositionForm internalPositionForm = homePage.clickInternalProjectPosition();
        internalPositionForm.clickPriority();
        internalPositionForm.clickUrgentPriority();
        internalPositionForm.clickProject();
        internalPositionForm.findProject();
        internalPositionForm.clickDateOfCreation();
        internalPositionForm.selectDateOfCreation();
        internalPositionForm.enterLocation("Armenia");
        internalPositionForm.clickLocation();
        internalPositionForm.clickRemoteType();
        internalPositionForm.selectRemoteType();
        internalPositionForm.addComment("Its a good idea");
        internalPositionForm.enterPositionName(InternalPositionName);
        internalPositionForm.clickRole();
        internalPositionForm.selectRole();
        internalPositionForm.clickEnglish();
        internalPositionForm.selectEnglish();
        internalPositionForm.clickButtonSkill();
        internalPositionForm.clickSkill();
        internalPositionForm.selectSkill();
        internalPositionForm.clickGrade();
        internalPositionForm.selectGrade();
        internalPositionForm.clickTabRequests();
        internalPositionForm.clickAddRequest();
        internalPositionForm.clickJobType();
        internalPositionForm.selectJobType();
        internalPositionForm.clickDeadline();
        internalPositionForm.selectDeadline();
        internalPositionForm.addRequiredPeople("3");
        internalPositionForm.buttonCreatePosition();
        Assert.assertTrue(homePage.getInternalPositionInGrid().contains(InternalPositionName), "Not success");

    }


}
