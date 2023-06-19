package gitHubTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
    }

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
         $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }

    @Test
    void action() {
        open("https://the-internet.herokuapp.com/drag_and_drop");


    }
}
