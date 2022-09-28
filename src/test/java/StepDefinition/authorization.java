package StepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static PageObject.PageElements.AuthorizationPageElem.*;
import static PageObject.PageSteps.AuthorizationSteps.openUrl;
import static utils.Configuration.getConfigurationValue;

public class authorization {


    @Когда("^пользователь заходит на сайт$")
    public static void пользовательЗаходитНаСайт() {
        openUrl(getConfigurationValue("jiraUrl"));
    }

    @И("^пользователь вводит логин$")
    public static void пользовательВводитЛогин() {
        loginLane.shouldBe(Condition.visible).click();
        loginLane.sendKeys(getConfigurationValue("login"));
    }

    @И("^пользователь вводит пароль$")
    public static void пользовательВводитПароль() {
        passwordLane.click();
        passwordLane.sendKeys(getConfigurationValue("password"));
    }

    @И("^пользователь нажимает кнопку логина$")
    public static void пользовательНажимаетКнопкуЛогина() {
        loginButton.click();
    }

    @Тогда("^пользователь авторизуется в системе$")
    public static void пользовательАвторизуетсяВСистеме() {
        welcomeJira.shouldBe(Condition.visible);
    }

}
