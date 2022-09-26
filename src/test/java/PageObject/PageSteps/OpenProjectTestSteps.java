package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.LoggedPageElem.projectTest;
import static PageObject.PageElements.LoggedPageElem.projectsDropButton;
import static PageObject.PageElements.TestProjectPageElem.imgTest;
import static PageObject.PageSteps.AuthorizationSteps.authorization;

public class OpenProjectTestSteps {

    @Step("Выбираем проект Тест")
    public static void openProjectTest() {
        authorization();
        projectsDropButton.shouldBe(Condition.visible).click();
        projectTest.click();
        imgTest.shouldBe(Condition.visible).shouldHave(Condition.attribute("alt", "Test"));
    }

}
