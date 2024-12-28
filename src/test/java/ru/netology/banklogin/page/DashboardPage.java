package ru.netology.banklogin.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ru.netology.banklogin.data.DataHelper;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final SelenideElement heading = $ ("[data-test-id=dashboard]");

    public DashboardPage(){
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);

    }
}
