package StepDefinition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static PageObject.PageElements.TestProjectPageElem.*;
import static PageObject.PageElements.TestProjectPageElem.getTestSelenium_bugVersion;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class checkTaskStatus {

    @Когда("^пользователь переходит в задачу TestSelenium_bug$")
    public void пользовательПереходитВЗадачуTesSelenium_bug() {
        taskSearchInput.sendKeys("TestSelenium_bug");
        testSelenium_bug.shouldBe(visible).click();
    }

    @Тогда("^пользователь видит статус задачи$")
    public void пользовательВидитСтатусЗадачи() {
        testSelenium_bugStatus.shouldBe(visible);
        System.out.println("Статус проекта TestSelenium_bug: " + testSelenium_bugStatus.getText());
        getTestSelenium_bugVersion.shouldBe(visible).shouldHave(text("Version 2.0"));
        System.out.println("Затронутая версия проекта: " + getTestSelenium_bugVersion.getText());
    }

}
