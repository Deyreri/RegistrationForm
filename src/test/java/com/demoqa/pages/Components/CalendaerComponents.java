package com.demoqa.pages.Components;

import static com.codeborne.selenide.Selenide.$;

public class CalendaerComponents {

    public CalendaerComponents setDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(day);
        $(".react-datepicker__year-select").selectOption(month);
        $(".react-datepicker__day--030" + year + ":not(.react-datepicker__day--outside-month)").click();
        return this;
    }
}