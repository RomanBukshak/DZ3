package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.LoggedPage.projectTest;
import static PageObject.PageElements.LoggedPage.projectsDropButton;
import static PageObject.PageSteps.AuthorizationPageSteps.authorization;

public class OpenProjectTestStep {

    @Step("Выбираем проект Тест")
    public static void openProjectTest() {
        authorization();
        projectsDropButton.click();
        projectTest.click();
    }

}
