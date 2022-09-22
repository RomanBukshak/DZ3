package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.AuthorizationPageElem.*;
import static PageObject.PageElements.CreatNewTaskElem.*;
import static PageObject.PageElements.LoggedPageElem.projectTest;
import static PageObject.PageElements.LoggedPageElem.projectsDropButton;
import static PageObject.PageSteps.AuthorizationSteps.openUrl;
import static utils.Configuration.getConfigurationValue;

public class CreatNewTaskSteps {

    @Step("Создать новую задачу")
    public static void creatNewTask() {
        openUrl(getConfigurationValue("jiraUrl"));
        loginLane.shouldBe(Condition.visible).click();
        loginLane.sendKeys(getConfigurationValue("login"));
        passwordLane.click();
        passwordLane.sendKeys(getConfigurationValue("password"));
        loginButton.click();
        projectsDropButton.shouldBe(Condition.visible).click();
        projectTest.click();
        issuesIcon.shouldBe(Condition.visible).click();
        creatNewTask.click();
        openInDialogBox.click();
        typeTaskDropMenu.click();
        typeTaskError.sendKeys("Ошибка");
        creatThema.sendKeys("Test Task");
        textButton.click();
        textAreaDescription.sendKeys("Описание тестовой задачи");
        fixInVersionV2.click();
        priorityField.click();
        priorityField.sendKeys("High");
        textAreaEnvironment.sendKeys("Google Chrome v. 105.0.5195.127");
        appointMeButton.click();
        creatButton.click();
        statusTask.shouldHave(Condition.text("Сделать"));
        inWorkButton.click();
        statusTask.shouldHave(Condition.text("В работе"));
        System.out.println("Создана задача: " + idTask.getText());
        businessProcessButton.click();
        doneButton.click();
        statusTask.shouldHave(Condition.text("Готово"));
    }
}
