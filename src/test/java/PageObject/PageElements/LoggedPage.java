package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoggedPage {
    public static SelenideElement projectsDropButton = $x("//a[text()='Проекты']");
    public static SelenideElement projectTest = $x("//strong[text()='Текущие проекты']//parent::div//descendant::a");

}
