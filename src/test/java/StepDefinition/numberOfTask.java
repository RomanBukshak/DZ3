package StepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static PageObject.PageElements.TestProjectPageElem.numberOfTaskList;
import static PageObject.PageElements.TestProjectPageElem.taskList;

public class numberOfTask {
    @И("^пользователь зашел на проект$")
    public static void пользовательЗашелНаПроект() {
        openProject.пользовательКликаетНаВыпадающийСписок();
        openProject.пользовательВыбираетПроект();
        openProject.открываетсяПроект();
    }

    @Когда("^пользователь переходит в Список задач$")
    public void пользовательПереходитВСписокЗадач(){
        taskList.shouldBe(Condition.visible).click();
    }

    @Тогда("^пользователь видит общее количество задач$")
    public void пользовательВидитОбщееКоличетсвоЗадач() {
        String str = numberOfTaskList.getText();
        String[] subStr;
        String delimiter = " ";
        subStr = str.split(delimiter);
        System.out.println("Общее количество задач: " + subStr[0]);
    }


}
