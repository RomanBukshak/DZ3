package PageObject.PageSteps.TestJira;
import Hooks.WebHooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static PageObject.PageSteps.AuthorizationSteps.authorization;
import static PageObject.PageSteps.CheckTaskStatusSteps.checkTaskStatus;
import static PageObject.PageSteps.CreatNewTaskSteps.creatNewTask;
import static PageObject.PageSteps.NumberOfTaskSteps.numberOfTask;
import static PageObject.PageSteps.OpenProjectTestSteps.openProjectTest;


public class TestJira extends WebHooks {
    @Test
    @Tag("1")
    @DisplayName("Проверка авторизации на сайте")
    public void Test_1() {
        authorization();
    }

    @Test
    @Tag("2")
    @DisplayName("Проверка открытия проекта")
    public void Test_2() {
        openProjectTest();
    }

    @Test
    @Tag("3")
    @DisplayName("Проверка количества задач в проекте")
    public void Test_3() {
        numberOfTask();
    }

    @Test
    @Tag("4")
    @DisplayName("Проверка статуса и версии задачи")
    public void Test_4() {
        checkTaskStatus();
    }

    @Test
    @Tag("5")
    @DisplayName("Создание новой задачи")
    public void Test_5() {
        creatNewTask();
    }

}
