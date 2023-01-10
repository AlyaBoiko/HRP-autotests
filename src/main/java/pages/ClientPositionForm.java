package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$x;

public class ClientPositionForm extends CreatePositionBase{
    //SoftAssert softAssert = new SoftAssert();

    private SelenideElement statusPositionType = $x("//div[text() = 'New Project Position']");
    private SelenideElement confirmationStatus = $x(".//input[@value='unconfirmed']");
    private SelenideElement fieldClient = $x(".//input[@id='client']");
    private SelenideElement clickClient = $x(".//div[@class ='rc-virtual-list-holder-inner']/descendant::div[@title='44 444']");
    private SelenideElement fieldProject = $x(".//input[@id='project']");
    private SelenideElement findProject = $x(".//div[@class='rc-virtual-list-holder-inner']/descendant::div[@title='666']");
    private SelenideElement fieldBillableStatus = $x(".//input[@id='candidate_requests_0_billable_status']");
    private SelenideElement selectBillableStatus = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Billable']");


    public String getNameClientPositionType() {
        return statusPositionType.getText();
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

}
