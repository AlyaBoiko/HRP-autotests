package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TraineePositionForm extends CreatePositionBase{
    private SelenideElement statusPositionType = $x(".//div[text() = 'New Trainee Position']");

    public String getTraineePositionType() {
        return statusPositionType.getText();
    }

}
