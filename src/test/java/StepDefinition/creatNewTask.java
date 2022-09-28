package StepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static PageObject.PageElements.CreatNewTaskElem.*;
import static PageObject.PageElements.CreatNewTaskElem.typeTaskDropMenu;

public class creatNewTask {
    @Когда("^пользователь переходит в Задачи$")
    public void пользовательПереходитВЗадачи() {
        issuesIcon.shouldBe(Condition.visible).click();
    }

    @И("^пользователь нажимает создать задачу$")
    public void пользовательНажимаетСоздатьЗадачу(){
        creatNewTask.click();
        openInDialogBox.click();
        typeTaskDropMenu.click();
    }

    @И("^пользователь заполняет необходимые поля задачи$")
    public void пользовательЗаполняетНеобходимыеПоляЗадачи() {
        typeTaskError.sendKeys("Ошибка");
        creatThema.sendKeys("Test Task");
        textButton.click();
        textAreaDescription.sendKeys("Описание тестовой задачи");
        fixInVersionV2.click();
        priorityField.click();
        priorityField.sendKeys("High");
        textAreaEnvironment.sendKeys("Google Chrome v. 105.0.5195.127");
        appointMeButton.click();
    }

    @И("^пользователь нажимает кнопку создать$")
    public void пользовательНажимаетКнопкуСоздать() {
        creatButton.click();
    }

    @Тогда("^создается новая задача с статусом \"Сделать\"$")
    public void создаетсяНоваяЗадачаССтатусомСделать() {
        statusTask.shouldHave(Condition.text("Сделать"));
    }

    @Когда("^пользователь нажимает кнопку \"В работе\"$")
    public void пользовательНажимаетКнопкуВРаботе(){
        inWorkButton.click();
    }

    @Тогда("^задача переходит в статус \"В работе\"$")
    public void задачаПереходитВСтатусВРаботе() {
        statusTask.shouldHave(Condition.text("В работе"));
        System.out.println("Создана задача: " + idTask.getText());
    }

    @Когда("^пользователь нажимает кнопку \"Выполнено\"$")
    public void пользовательНажимаетКнопкуВыполнено() {
        businessProcessButton.click();
        doneButton.click();
    }

    @Тогда("^задача переходит в статус \"Выполнено\"$")
    public void задачаПереходитВСтатусВыполнено() {
        statusTask.shouldHave(Condition.text("Готово"));
    }


}
