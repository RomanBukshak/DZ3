package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.LoggedPage.projectTest;
import static PageObject.PageElements.LoggedPage.projectsDropButton;
import static PageObject.PageElements.TestProjectPage.numberOfTaskList;
import static PageObject.PageElements.TestProjectPage.taskList;
import static PageObject.PageSteps.AuthorizationPageSteps.authorization;

public class NumberOfTaskSteps {

    @Step ("Проверить общее количество задач")
    public static void numberOfTask() {
        authorization();
        projectsDropButton.click();
        projectTest.click();
        taskList.shouldBe(Condition.visible).click();
        String str = numberOfTaskList.getText();
        String[] subStr;
        String delimeter = " ";
        subStr = str.split(delimeter);
        System.out.println("Общее количество тестов: " + subStr[0]);
    }
}
