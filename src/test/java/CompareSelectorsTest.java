import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CompareSelectorsTest {
    @BeforeAll
    static void settingsBeforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void compareConsequenceAndInOneSelectors(){
        open("/automation-practice-form");
        $("div.row div h1").shouldBe(exist);
        $("div.row div").$("h1").shouldNotBe(exist);
    }
}
