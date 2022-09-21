package Hooks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {
    @BeforeAll
    static void setUp(){
        Configuration.startMaximized = true;
    }
}