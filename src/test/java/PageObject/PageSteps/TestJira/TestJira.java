package PageObject.PageSteps.TestJira;
import Hooks.WebHooks;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static PageObject.PageElements.AuthorizationPageElem.welcomeJira;
import static PageObject.PageSteps.AuthorizationPageSteps.authorization;
import static PageObject.PageSteps.CheckTaskStatusSteps.checkTaskStatus;
import static PageObject.PageSteps.NumberOfTaskSteps.numberOfTask;
import static PageObject.PageSteps.OpenProjectTestStep.openProjectTest;
import static com.codeborne.selenide.Selenide.open;


public class TestJira extends WebHooks {
    @Test
    @Tag("1")
    @DisplayName("Проверка авторизации на сайте")
    public void Test_1() {
        open("https://edujira.ifellow.ru/");
        authorization();
        welcomeJira.shouldBe(Condition.visible);
    }

    @Test
    @Tag("2")
    @DisplayName("Проверка открытия проекта")
    public void Test_2() {
        open("https://edujira.ifellow.ru/");
        openProjectTest();
    }

    @Test
    @Tag("3")
    @DisplayName("Проверка количества задач в проекте")
    public void Test_3() {
        open("https://edujira.ifellow.ru/");
        numberOfTask();
    }

    @Test
    @Tag("4")
    @DisplayName("Проверка статуса и версии задачи")
    public void Test_4() {
        open("https://edujira.ifellow.ru/");
        checkTaskStatus();
    }
}
