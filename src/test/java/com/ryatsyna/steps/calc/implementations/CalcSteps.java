package com.ryatsyna.steps.calc.implementations;

import com.ryatsyna.pages.calc.CalcPageObject;
import net.thucydides.core.annotations.Step;

public class CalcSteps {

    CalcPageObject calcWindow;

    @Step
    public void enters_eight_plus_two() {
        calcWindow.eightPlusTwo();
    }

    @Step
    public void clicks_equals() {
        calcWindow.clickEquals();
    }

    @Step
    public void checks_the_result() {
        calcWindow.checkResult();
    }
}