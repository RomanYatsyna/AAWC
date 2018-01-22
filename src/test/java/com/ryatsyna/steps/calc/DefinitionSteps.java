package com.ryatsyna.steps.calc;

import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import net.thucydides.core.annotations.Steps;

import com.ryatsyna.steps.calc.implementations.CalcSteps;

public class DefinitionSteps {

    @Steps
    CalcSteps user;

    @Если("^сложить 8 и 2$")
    public void sumTwoNumbers() {
        user.enters_eight_plus_two();
    }

    @И("^нажать равно$")
    public void clickEquals() {
        user.clicks_equals();
    }

    @То("^результат будет 10$")
    public void assertResult() {
        user.checks_the_result();
    }
}
