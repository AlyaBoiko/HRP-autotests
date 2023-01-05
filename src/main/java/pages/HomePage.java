package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private SelenideElement positionsTitle = $x(".//b[text() = 'Positions']");

    public void checkPositionTitleVisible(){
        positionsTitle.should(Condition.visible);
    }
}
