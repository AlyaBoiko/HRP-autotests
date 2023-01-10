package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    private SelenideElement positionsTitle = $x(".//b[text() = 'Positions']");
    private SelenideElement tabActive = $x(".//a[text()='Active']");
    private SelenideElement tabMine = $x(".//a[text()='Mine']");
    private SelenideElement tabHistory = $x(".//a[text()='History']");
    private SelenideElement filteringByName = $x(".//input[@placeholder='Enter position']");
    private SelenideElement groupByProject = $x(".//input[@type='checkbox']");
    private SelenideElement statusPosition = $x(".//span[text() = 'SDET Middle']");
    private SelenideElement buttonAddPosition = $x(".//span[text() = '+ Add position']");
    private SelenideElement projectPosition = $x(".//span[text() = 'Project position']");
    private SelenideElement internalProjectPosition = $x(".//span[text() = 'Internal project position']");
    private SelenideElement benchPosition = $x(".//span[text() = 'Bench position']");
    private SelenideElement preOfferPosition = $x(".//span[text() = 'Pre-offer position']");
    private SelenideElement traineePosition = $x(".//span[text() = 'Trainee position']");
    private SelenideElement findNoData = $x(".//div[text() = 'No Data']");
    private SelenideElement internalPositionInGrid = $x(".//span[text() = 'InternalPosition33']");
    private SelenideElement clientPositionInGrid = $x(".//span[text() = 'Position33']");
    private SelenideElement benchPositionInGrid = $x(".//span[text() = 'Bench33']");
    private SelenideElement preOfferPositionInGrid = $x(".//span[text() = 'Pre-offer33']");
    private SelenideElement traineePositionInGrid = $x(".//span[text() = 'Trainee33']");
    private SelenideElement filteringByType = $x(".//div[@class='ant-table-filter-column']/descendant::span[text()='Position name']/following-sibling::span");
    private SelenideElement benchCheckBox= $x(".//input[@value='bench']");
    private SelenideElement traineeCheckBox= $x(".//input[@value='trainee']");
    private SelenideElement buttonOk= $x(".//div[@class='ant-table-filter-dropdown']/descendant::div[@class='ant-table-filter-dropdown-btns']//span[text()= 'OK']");
    private SelenideElement benchLabel = $x(".//tr[@class='ant-table-row ant-table-row-level-0']//span[@type]");


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

//    public List<Boolean> getAllPositions() {
//        return
//                benchLabel.$$().map(webElement ->
//                        webElement.getText().contains("Bench")).collect(Collectors.toList());
//    }
}
