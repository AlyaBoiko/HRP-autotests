package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static java.util.stream.Collectors.toList;

public class HomePage {

    SelenideElement positionsTitle = $x(".//b[text() = 'Positions']");
    SelenideElement tabActive = $x(".//a[text()='Active']");
    SelenideElement tabMine = $x(".//a[text()='Mine']");
    SelenideElement tabHistory = $x(".//a[text()='History']");
    SelenideElement filteringByName = $x(".//input[@placeholder='Enter position']");
    SelenideElement groupByProject = $x(".//input[@type='checkbox']");
    SelenideElement statusPosition = $x(".//span[text() = 'SDET Middle']");
    SelenideElement buttonAddPosition = $x(".//span[text() = '+ Add position']");
    SelenideElement projectPosition = $x(".//span[text() = 'Project position']");
    SelenideElement internalProjectPosition = $x(".//span[text() = 'Internal project position']");
    SelenideElement benchPosition = $x(".//span[text() = 'Bench position']");
    SelenideElement preOfferPosition = $x(".//span[text() = 'Pre-offer position']");
    SelenideElement traineePosition = $x(".//span[text() = 'Trainee position']");
    SelenideElement findNoData = $x(".//div[text() = 'No Data']");
    SelenideElement internalPositionInGrid = $x("(.//span[@class = 'ant-typography sc-gKPRtg OjNDH'])[1]");
    SelenideElement clientPositionInGrid = $x("(.//span[@class = 'ant-typography sc-gKPRtg OjNDH'])[1]");
    SelenideElement benchPositionInGrid = $x("(.//span[@class = 'ant-typography sc-gKPRtg OjNDH'])[1]");
    SelenideElement preOfferPositionInGrid = $x("(.//span[@class = 'ant-typography sc-gKPRtg OjNDH'])[1]");
    SelenideElement traineePositionInGrid = $x("(.//span[@class = 'ant-typography sc-gKPRtg OjNDH'])[1]");
    SelenideElement filteringByType = $x(".//div[@class='ant-table-filter-column']/descendant::span[text()='Position name']/following-sibling::span");
    SelenideElement benchCheckBox= $x(".//input[@value='bench']");
    SelenideElement traineeCheckBox= $x(".//input[@value='trainee']");
    SelenideElement buttonOk= $x(".//div[@class='ant-table-filter-dropdown']/descendant::div[@class='ant-table-filter-dropdown-btns']//span[text()= 'OK']");
    ElementsCollection benchLabel = $$x(".//tr[@class='ant-table-row ant-table-row-level-0']//span[@type]");


    public void checkPositionTitleVisible(){
        positionsTitle.should(Condition.visible);
    }

//    public String getPosition() {
//        statusPosition.$x();
//    }

    public void clickCreateButton(){
        buttonAddPosition.click();
    }

    public ClientPositionForm clickClientProjectPosition(){
        projectPosition.click();
        return page(ClientPositionForm.class);
    }

    public InternalPositionForm clickInternalProjectPosition(){
        internalProjectPosition.click();
        return page(InternalPositionForm.class);
    }

    public BenchPositionForm clickBenchPosition(){
        benchPosition.click();
        return page(BenchPositionForm.class);
    }

    public PreOfferPositionForm clickPreOfferPosition(){
        preOfferPosition.click();
        return page(PreOfferPositionForm.class);
    }

    public TraineePositionForm clickTraineePosition(){
        traineePosition.click();
        return page(TraineePositionForm.class);
    }

    public PositionsActiveTab clickActiveTab(){
        tabActive.click();
        return page(PositionsActiveTab.class);
    }

    public PositionsMineTab clickMineTab(){
        tabMine.click();
        return page(PositionsMineTab.class);
    }

    public PositionsHistoryTab clickHistoryTab(){
        tabHistory.click();
        return page(PositionsHistoryTab.class);
    }

    public void filteringByName(String positionName){
        filteringByName.sendKeys(positionName);
    }
    public String getNoData() {
        return findNoData.getText();
    }

    public String getInternalPositionInGrid() {
        return internalPositionInGrid.getText();
    }
    public String getClientPositionInGrid() {
        return clientPositionInGrid.getText();
    }
    public String getBenchPositionInGrid() {
        return benchPositionInGrid.getText();
    }
    public String getPreOfferPositionInGrid() {
        return preOfferPositionInGrid.getText();
    }

    public String getTraineePositionInGrid() {
        return traineePositionInGrid.getText();
    }

    public void clickFilteringByType(){
        filteringByType.click();
    }
    public void selectFilteringByBenchLabel(){
        benchCheckBox.click();
    }

    public void selectFilteringByTraineeLabel(){
        traineeCheckBox.click();
    }

    public void clickOkButton(){
        buttonOk.click();
    }

    public List<Boolean> getAllPositions() throws Exception {
//        if (benchLabel.isEmpty()) {
//            throw new Exception();
//        }
//        $x(".//tbody[@class = 'ant-table-tbody']").shouldBe(Condition.visible);
//        $x(".//tbody[@class = 'ant-table-tbody']/tr").shouldBe(Condition.visible);

        //ToDo: Realise without the 142 line.

        $x(".//tr[@class='ant-table-row ant-table-row-level-0']//span[@type]").shouldHave(Condition.text("Bench"));
        return
                benchLabel.stream().map(webElement ->{
                    webElement.shouldBe(Condition.visible);
                    return webElement.getOwnText().contains("Bench");
                        }
                ).toList();
    }
}
