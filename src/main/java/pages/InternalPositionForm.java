package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class InternalPositionForm extends CreatePositionBase{
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
}
