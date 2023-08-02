package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSolutionTest {

        @BeforeAll
        static void beforeAll() {
            Configuration.browserSize = "1920x1080";
            Configuration.savePageSource = false;
            Configuration.screenshots = false;
        }

        @Test
        void gitSolutions() {
            open("https://github.com/");
            $("[aria-label='Global']").$(byText("Solutions")).hover();
            $("[href='/enterprise']").click();
            // $$("ul [aria-labelledby='solutions-for-heading']").first().$("a").click();
            $(".h1-mktg").shouldHave(text("Build like the best"));



        }
    }


