package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.LoggedPage.projectTest;
import static PageObject.PageElements.LoggedPage.projectsDropButton;
import static PageObject.PageElements.TestProjectPage.*;
import static PageObject.PageSteps.AuthorizationPageSteps.authorization;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class CheckTaskStatusSteps {

    @Step("Проверить статус задачи и привязку в затронутой версии")
    public static void checkTaskStatus() {
        authorization();
        projectsDropButton.click();
        projectTest.click();
        taskList.shouldBe(visible).click();
        taskSearchInput.sendKeys("TestSelenium_bug");
        testSelenium_bug.shouldBe(visible).click();
        testSelenium_bugStatus.shouldBe(visible).shouldHave(text("В работе"));
    }
}
