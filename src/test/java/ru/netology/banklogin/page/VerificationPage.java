package ru.netology.banklogin.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ru.netology.banklogin.data.DataHelper;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.google.common.base.Verify.verify;


public class VerificationPage {
    private final SelenideElement codeField = $ ("[data-test-id=code] .input__control");
    private final SelenideElement verifyButton = $ ("[data-test-id=action-verify]");
    private final SelenideElement errorNotification = $ ("[data-test-id=error-notification] .notification__content");

    public void verifyVerificationPageVisibility(){
        codeField.shouldBe(visible);
    }

    public void verifyErrorNotification(String expectedText) {
        errorNotification.shouldHave(exactText(expectedText)).shouldBe(visible);
    }

    public DashboardPage validVerify(String verificationCode) {
        verify(verificationCode);
        return new DashboardPage();

        }

    public void verify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
    }

}
