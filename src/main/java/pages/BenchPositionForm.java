package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BenchPositionForm extends CreatePositionBase{
    private SelenideElement statusPositionType = $x(".//div[text() = 'New Bench Position']");

    public String getNameBenchPositionType() {
        return statusPositionType.getText();
    }
}
