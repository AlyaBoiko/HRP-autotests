package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PreOfferPositionForm extends CreatePositionBase{
    private SelenideElement statusPositionType = $x(".//div[text() = 'New Pre-offer Position']");

    public String getNamePreOfferPositionType() {
        return statusPositionType.getText();
    }
}
