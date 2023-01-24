package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class ClientPositionForm extends CreatePositionBase{
    //SoftAssert softAssert = new SoftAssert();
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    CreatePositionBase createPositionBase = new CreatePositionBase();
    private String ClientPositionName = createPositionBase.GeneratingPositionName();

    private SelenideElement statusPositionType = $x(".//div[text() = 'New Project Position']");
    private SelenideElement confirmationStatus = $x(".//input[@value='unconfirmed']");
    private SelenideElement fieldClient = $x(".//input[@id='client']");
    private SelenideElement clickClient = $x(".//div[@class ='rc-virtual-list-holder-inner']/descendant::div[@title='44 444']");
    private SelenideElement fieldProject = $x(".//input[@id='project']");
    private SelenideElement findProject = $x(".//div[@class='rc-virtual-list-holder-inner']/descendant::div[@title='666']");
    private SelenideElement fieldBillableStatus = $x(".//input[@id='candidate_requests_0_billable_status']");
    private SelenideElement selectBillableStatus = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Billable']");


    public String getNameClientPositionType() {
        return statusPositionType.getOwnText();
    }

    public ClientPositionForm checkModalClientPositionTitleExist() {
        statusPositionType.should(Condition.exist);
        return this;
    }

    public void clickCheckBoxConfirmation(){
        confirmationStatus.click();
    }

    public void enterClient(String client)
    {
        fieldClient.sendKeys(client);
    }
    public void clickClient()
    {
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", driver.findElement(clickClient));
        clickClient.click();
    }
//    public void clickProject()
//    {
//        softAssert.assertTrue(false, "we are dropped");
//        softAssert.assertEquals(false, true, "all good");
//        driver.findElement(fieldProject).click();
//        softAssert.assertAll();
//    }

    public void clickProject()
    {
        fieldProject.click();
    }

    public void findProject()
    {
        findProject.click();
    }
    public void clickBillableStatus()
    {

        fieldBillableStatus.click();
    }
    public void selectBillableStatus()
    {
        selectBillableStatus.click();
    }

    public void CreateClientProjectPosition(){

        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(ClientPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        ClientPositionForm clientPositionForm = homePage.clickClientProjectPosition();
        clientPositionForm.clickCheckBoxConfirmation();
        clientPositionForm.clickPriority();
        clientPositionForm.clickUrgentPriority();
        clientPositionForm.enterClient("44 444");
        clientPositionForm.clickClient();
        clientPositionForm.clickProject();
        clientPositionForm.findProject();
        clientPositionForm.clickDateOfCreation();
        clientPositionForm.selectDateOfCreation();
        clientPositionForm.enterLocation("Armenia");
        clientPositionForm.clickLocation();
        clientPositionForm.clickRemoteType();
        clientPositionForm.selectRemoteType();
        clientPositionForm.addComment("Its a good idea");
        clientPositionForm.enterPositionName(ClientPositionName);
        clientPositionForm.clickRole();
        clientPositionForm.selectRole();
        clientPositionForm.clickEnglish();
        clientPositionForm.selectEnglish();
        clientPositionForm.clickButtonSkill();
        clientPositionForm.clickSkill();
        clientPositionForm.selectSkill();
        clientPositionForm.clickGrade();
        clientPositionForm.selectGrade();
        clientPositionForm.clickTabRequests();
        clientPositionForm.clickAddRequest();
        clientPositionForm.clickBillableStatus();
        clientPositionForm.selectBillableStatus();
        clientPositionForm.clickJobType();
        clientPositionForm.selectJobType();
        clientPositionForm.clickDeadline();
        clientPositionForm.selectDeadline();
        clientPositionForm.addRequiredPeople("3");
        clientPositionForm.buttonCreatePosition();
        Assert.assertTrue(homePage.getClientPositionInGrid().contains(ClientPositionName), "not success");

    }

}
