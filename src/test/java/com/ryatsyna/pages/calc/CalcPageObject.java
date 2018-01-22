package com.ryatsyna.pages.calc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalcPageObject extends PageObject {
    public CalcPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(accessibilityId = "num8Button")
    public WebElementFacade num8Button;

    @FindBy(accessibilityId = "num2Button")
    public WebElementFacade num2Button;

    @FindBy(accessibilityId = "plusButton")
    public WebElementFacade plusButton;

    @FindBy(accessibilityId = "equalButton")
    public WebElementFacade equalsButton;

    @FindBy(accessibilityId = "CalculatorResults")
    public WebElementFacade calculatorResults;

    public void eightPlusTwo() {
        num8Button.click();
        plusButton.click();
        num2Button.click();
    }

    public void clickEquals() {
        equalsButton.click();
    }

    public void checkResult() {
        assertThat(calculatorResults.getText(), equalTo("Display is 10"));
    }
}