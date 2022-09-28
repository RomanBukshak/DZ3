package StepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static PageObject.PageElements.LoggedPageElem.projectTest;
import static PageObject.PageElements.LoggedPageElem.projectsDropButton;
import static PageObject.PageElements.TestProjectPageElem.imgTest;

public class openProject {

    @Дано("^пользователь авторизован$")
    public static void пользовательАвторизован() {
        authorization.пользовательЗаходитНаСайт();
        authorization.пользовательВводитЛогин();
        authorization.пользовательВводитПароль();
        authorization.пользовательНажимаетКнопкуЛогина();
        authorization.пользовательАвторизуетсяВСистеме();
    }

    @Когда("^пользователь кликает на выпадающий список$")
    public static void пользовательКликаетНаВыпадающийСписок() {
        projectsDropButton.shouldBe(Condition.visible).click();
    }

    @И("^пользователь выбирает проект$")
    public static void пользовательВыбираетПроект() {
        projectTest.click();
    }

    @Тогда("^открывается проект$")
    public static void открываетсяПроект() {
        imgTest.shouldBe(Condition.visible).shouldHave(Condition.attribute("alt", "Test"));
    }

}
