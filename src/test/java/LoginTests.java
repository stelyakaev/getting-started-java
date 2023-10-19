import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";



        open("https://qa.guru/cms/system/login");
        $(".login-form").shouldHave(text("Войти"));
        $("[name=email]").setValue("stelyakaev@rtc.usetech.ru");
        $("[name=password]").setValue("RleBchx!3LgXu");
        $(".btn-success").click();
        $(".main-header__login").click();
//        open("https://qa.guru/cms/system/login");

        $(".logined-form").shouldHave(text("Здравствуйте, Станислав"));




    }
}
