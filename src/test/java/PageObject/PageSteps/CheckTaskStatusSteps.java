package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.AuthorizationPageElem.*;
import static PageObject.PageElements.LoggedPageElem.projectTest;
import static PageObject.PageElements.LoggedPageElem.projectsDropButton;
import static PageObject.PageElements.TestProjectPageElem.*;
import static PageObject.PageSteps.AuthorizationSteps.openUrl;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static utils.Configuration.getConfigurationValue;

public class CheckTaskStatusSteps {

    @Step("Проверка статуса задачи и привязки в затронутой версии")
    public static void checkTaskStatus() {
        openUrl(getConfigurationValue("jiraUrl"));
        loginLane.shouldBe(Condition.visible).click();
        loginLane.sendKeys(getConfigurationValue("login"));
        passwordLane.click();
        passwordLane.sendKeys(getConfigurationValue("password"));
        loginButton.click();
        projectsDropButton.shouldBe(Condition.visible).click();
        projectTest.click();
        taskList.shouldBe(visible).click();
        taskSearchInput.sendKeys("TestSelenium_bug");
        testSelenium_bug.shouldBe(visible).click();
        testSelenium_bugStatus.shouldBe(visible);
        System.out.println("Статус проекта TestSelenium_bug: " + testSelenium_bugStatus.getText());
        getTestSelenium_bugVersion.shouldBe(visible).shouldHave(text("Version 2.0"));
        System.out.println("Затронутая версия проекта: " + getTestSelenium_bugVersion.getText());
    }
}
