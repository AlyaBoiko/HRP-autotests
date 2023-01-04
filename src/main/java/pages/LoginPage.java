package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private SelenideElement login = $x(".//*[@id='email']");
    private SelenideElement password = $x(".//*[@id='password']");
    private SelenideElement loginButton = $x(".//button[@type='submit']");
    private SelenideElement statusUnSuccess = $x(".//div[contains(concat(' ', @class, ' '), ' ant-message-error ')]/descendant::span[text()]");


    public LoginPage fillLoginField(String loginText){
        login.setValue(loginText);
        return this;
    }

    public LoginPage fillPasswordField(String passwordText){
        password.setValue(passwordText);
        return this;
    }

    public HomePage clickSubmit(){
        loginButton.click();
        return page(HomePage.class);
    }

    public void checkErrorMsg(String msgToCheck){
        statusUnSuccess.shouldHave(Condition.text(msgToCheck));
    }
}
