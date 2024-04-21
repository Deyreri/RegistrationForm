package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Val;
import com.demoqa.pages.Components.CalendaerComponents;
import com.demoqa.pages.Components.ResultStableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFromPage {

    private final static String TITLE_TEXT = "Thanks for submitting the form";

    private ResultStableComponent resultStableComponent = new ResultStableComponent();
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneNumberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            currentAddressInput = $("#currentAddress"),
            stateCityWrapperInput = $("#stateCity-wrapper"),
            stateCityInput = $("#stateCity-wrapper");

    public RegistrationFromPage openPage(String url) {
        open(url);
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    public RegistrationFromPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFromPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationFromPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public RegistrationFromPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }
    public RegistrationFromPage setBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        new CalendaerComponents().setDay(day, month, year);
        return this;
    }

    public RegistrationFromPage checkResultTableVisible() {
        resultStableComponent.checkVisible();

        return this;
    }
    public RegistrationFromPage checkResult(String key, String value) {
        resultStableComponent.checkResult(key, value);

        return this;
    }

    public RegistrationFromPage setNumberPhone(String value) {
        phoneNumberInput.setValue(value);

        return this;
    }

    public RegistrationFromPage setSubject(String value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationFromPage setHobbiesWrapper(String value) {
        hobbiesWrapperInput.$(byText(value)).click();

        return this;
    }

    public RegistrationFromPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);


        return this;
    }

    public RegistrationFromPage setStateCityWrapper(String value) {
        stateCityWrapperInput.$(byText(value)).click();

        return this;
    }

    public RegistrationFromPage setStateCity(String value) {
        stateCityWrapperInput.$(byText(value)).click();

        return this;
    }
}
