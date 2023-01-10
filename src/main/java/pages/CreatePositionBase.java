package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreatePositionBase {
    private SelenideElement priority = $x(".//input[@id='priority']");
    private SelenideElement urgentPriority = $x(".//div[@class='rc-virtual-list-holder-inner']/descendant::div[text()='Urgent']");
    private SelenideElement dateOfCreation = $x(".//input[@id='opened_at']");
    private SelenideElement inputDateOfCreation = $x("(.//a[@class='ant-picker-today-btn'])[1]");
    private SelenideElement originLocationCountry = $x(".//input[@id='origin_location_country']");
    private SelenideElement clickLocation = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Armenia']");
    private SelenideElement remoteType = $x(".//input[@id='remote_types']");
    private SelenideElement selectRemoteType = $x(".//div[@class='rc-virtual-list-holder-inner']/descendant::div[@title='Off-shore']");
    private SelenideElement fieldComment = $x(".//textarea[@id='comment']");
    private SelenideElement overComment = $x(".//div[text()='Ensure this filed has no more then 511 characters']");
    private SelenideElement fieldPositionName = $x(".//input[@id='title']");
    private SelenideElement fieldRole = $x(".//input[@id='role']");
    private SelenideElement selectRole = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='SDE']");
    private SelenideElement fieldEnglishLevel = $x(".//input[@id='english_level']");
    private SelenideElement selectEnglishLevel = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Beginner']");
    private SelenideElement buttonAddSkill = $x(".//div[@class='ant-form-item-control-input']//button[@type='button']");
    private SelenideElement fieldSkill = $x(".//input[@id='skills_0_skill']");
    private SelenideElement selectSkill = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='32-bit']");
    private SelenideElement fieldGrade = $x(".//h2[text()='Position details']/parent::section/descendant::input[@type='search' and contains(@id, 'rc_select')]");
    //private final By fieldGrade1 = By.xpath("//input[@type='search' and contains(@id, 'rc_select')]");
    private SelenideElement selectGrade = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Expert']");
    private SelenideElement tabRequests = $x(".//div[@class='ant-space-item']//span[text()='Requests']");
    private SelenideElement buttonAddRequest = $x(".//h2[text()='Candidate request']/parent::section/descendant::button[@type='button']");
    private SelenideElement fieldJobType = $x(".//input[@id='candidate_requests_0_job_type']");
    private SelenideElement selectJobType = $x(".//div[@class='rc-virtual-list-holder-inner']//div[@title='Full-time']");
    private SelenideElement fieldDeadline = $x(".//input[@id='candidate_requests_0_deadline']");
    private SelenideElement selectDeadline = $x("(.//a[@class='ant-picker-today-btn'])[2]");
    private SelenideElement fieldRequiredPeople = $x(".//input[@id='candidate_requests_0_required']");
    private SelenideElement buttonCreatePosition = $x(".//div[@class='ant-col ant-col-4']/descendant::span[text()='Create Position']");


    public void clickPriority(){
        priority.click();
    }
    public void clickUrgentPriority(){
        urgentPriority.click();
    }
    public void enterLocation(String location)
    {
        originLocationCountry.sendKeys(location);
    }
    public void clickDateOfCreation()
    {
        dateOfCreation.click();
    }
    public void selectDateOfCreation()
    {
        inputDateOfCreation.click();
    }
    public void clickLocation()
    {
        clickLocation.click();
    }
    public void clickRemoteType()
    {
        remoteType.click();
    }
    public void selectRemoteType()
    {
        selectRemoteType.click();
    }
    public void addComment(String comment)
    {
        fieldComment.sendKeys(comment);
    }
    public String getCommentMassage() {
        return overComment.getText();
    }
    public void enterPositionName(String positionName)
    {
        fieldPositionName.sendKeys(positionName);
    }
    public void clickRole()
    {
        fieldRole.click();
    }
    public void selectRole()
    {
        selectRole.click();
    }
    public void clickEnglish()
    {
        fieldEnglishLevel.click();
    }
    public void selectEnglish()
    {
        selectEnglishLevel.click();
    }
    public void clickButtonSkill()
    {
        buttonAddSkill.click();
    }
    public void clickSkill()
    {
        fieldSkill.click();
    }
    public void selectSkill()
    {
        selectSkill.click();
    }
    public void clickGrade()
    {
        fieldGrade.click();
    }
    public void selectGrade()
    {
        selectGrade.click();
    }
    public void clickTabRequests()
    {
        tabRequests.click();
    }
    public void clickAddRequest()
    {
        buttonAddRequest.click();
    }
    public void clickJobType()
    {
        fieldJobType.click();
    }
    public void selectJobType()
    {
        selectJobType.click();
    }
    public void clickDeadline()
    {
        fieldDeadline.click();
    }
    public void selectDeadline()
    {
        selectDeadline.click();
    }
    public void addRequiredPeople(String requiredPeople)
    {
        fieldRequiredPeople.sendKeys(requiredPeople);
    }
    public void buttonCreatePosition()
    {
        buttonCreatePosition.click();
    }

}
