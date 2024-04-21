package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFromPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFromTest {

    RegistrationFromPage registrationFromTest = new RegistrationFromPage();
    @BeforeAll

    static void configuration () {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test

    void fillFormTest() {
        registrationFromTest.openPage("/automation-practice-form")
        .setFirstName("Alex")
        .setLastName("Egorov")
        .setEmail("Alex@egorov.com")
        .setGender("Other")
        .setNumberPhone("1234567890")
        .setBirthDay("30", "July","2008")
        .setSubject("Math")
        .setHobbiesWrapper("Sport")
        .setCurrentAddress("Some address 1");
        $("#state").click();
        registrationFromTest.setStateCityWrapper("NCR");
        $("#city").click();
        registrationFromTest.setStateCity("Delhi");
        $("#submit").click();

        registrationFromTest.checkResultTableVisible()
        .checkResult("Student Name", "Alex Egorov")
        .checkResult("Student Email", "alex@egorov.com")
        .checkResult("Date of Birth", "30 July,2008");
    }
}
