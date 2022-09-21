package PageObject.PageSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import static PageObject.PageElements.AuthorizationPageElem.*;
import static com.codeborne.selenide.Selenide.open;
import static utils.Configuration.getConfigurationValue;

public class AuthorizationSteps {

    @Step("Переход на Url")
    public static void openUrl(String url) {
        open(url);
    }

    @Step("Авторизация в системе")
    public static void authorization() {
        openUrl(getConfigurationValue("jiraUrl"));
        loginLane.shouldBe(Condition.visible).click();
        loginLane.sendKeys(getConfigurationValue("login"));
        passwordLane.click();
        passwordLane.sendKeys(getConfigurationValue("password"));
        loginButton.click();
        welcomeJira.shouldBe(Condition.visible);
    }

}
