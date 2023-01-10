package Login;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class CreatePosition {
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    private ClientPositionForm clientPositionForm = new ClientPositionForm();
    private InternalPositionForm internalPositionForm = new InternalPositionForm();
    private BenchPositionForm benchPositionForm = new BenchPositionForm();
    private PreOfferPositionForm preOfferPositionForm = new PreOfferPositionForm();
    private TraineePositionForm traineePositionForm = new TraineePositionForm();

    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

    private String InternalPositionName = "InternalPosition33";
    private String ClientPositionName = "Position33";
    private String BenchPositionName = "Bench33";
    private String PreOfferPositionName = "Pre-offer33";
    private String TraineePositionName = "Trainee33";

    @Test
    public void CreateClientProjectPosition(){
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(ClientPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        homePage.clickClientProjectPosition();
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
        Assert.assertTrue(homePage.getClientPositionInGrid().contains("Position33"), "not success");
        PositionsMineTab positionsMineTab = homePage.clickMineTab();
        //Assert.assertTrue(positionsMineTab.getClientPositionInGrid().contains("Position33"), "not success");

    }

    @Test
    public void CreateInternalProjectPosition(){
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(InternalPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        homePage.clickInternalProjectPosition();
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
        Assert.assertTrue(homePage.getInternalPositionInGrid().contains("InternalPosition33"), "not success");
        PositionsMineTab positionsMineTab = homePage.clickMineTab();
        //Assert.assertTrue(positionsMineTab.getInternalPositionInGrid().contains("InternalPosition33"), "not success");

    }

    @Test
    public void CreateBenchPosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(BenchPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        homePage.clickBenchPosition();
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
        Assert.assertTrue(homePage.getBenchPositionInGrid().contains("Bench33"), "not success");
        PositionsMineTab positionsMineTab = homePage.clickMineTab();
        //Assert.assertTrue(positionsMineTab.getBenchPositionInGrid().contains("Bench33"), "not success");

    }

    @Test
    public void CreatePreOfferPosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(PreOfferPositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        homePage.clickPreOfferPosition();
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
        Assert.assertTrue(homePage.getPreOfferPositionInGrid().contains("Pre-offer33"), "not success");
        PositionsMineTab positionsMineTab = homePage.clickMineTab();
        //ssert.assertTrue(positionsMineTab.getPreOfferPositionInGrid().contains("Pre-offer33"), "not success");

    }
    @Test
    public void CreateTraineePosition() {
        open("https://stage.hrportal.akvelon.net/");
        loginPage.fillLoginField("alevtina.boiko@akvelon.com")
                .fillPasswordField("C!j2Q64~V6!!")
                .clickSubmit();
        homePage.filteringByName(TraineePositionName);
        Assert.assertTrue(homePage.getNoData().contains("No Data"), "not success");
        homePage.clickCreateButton();
        homePage.clickTraineePosition();
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
        Assert.assertTrue(homePage.getTraineePositionInGrid().contains("Trainee33"), "not success");
        PositionsMineTab positionsMineTab = homePage.clickMineTab();
        //Assert.assertTrue(positionsMineTab.getTraineePositionInGrid().contains("Trainee33"), "not success");

    }

}
