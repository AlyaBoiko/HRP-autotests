package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private SelenideElement statusSuccess = $x(".//b[text() = 'Positions']");

    public void checkSuccessLogin(String correctPage){
        statusSuccess.shouldHave(Condition.text(correctPage));
    }
}
