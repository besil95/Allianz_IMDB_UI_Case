package org.example.stepDefinitions;

import org.example.base.BaseMethods;
import org.openqa.selenium.WebDriver;


import static org.example.locator.IMDBLocators.*;

public class StepDefinitions extends BaseMethods {
    public StepDefinitions(WebDriver driver) {
        super(driver);
    }

    public StepDefinitions menu() {
        clickElement(MENU);
        return this;
    }

    public StepDefinitions categories() {
        checkVisible(AWARDS);
        hoverElement(OSCARS);
        clickJS(OSCARS);
        return this;
    }

    public StepDefinitions oscarsGuıde() {
        checkVisible(EVENT_HISTORY);
        clickElement(DATE_1929);
        return this;
    }

    public StepDefinitions honoraryAward() {
        //scrollJS(THE_CIRCUS);
        hoverElement(HONORARY_AWARD);
        checkVisible(HONORARY_AWARD);
        clickElement(THE_CIRCUS);
        return this;
    }

    public StepDefinitions getInfo() {
        getText(DIRECTOR);
        getText(WRITER);
        getText(STARS);
        clickElement(IMDB);
        return this;
    }

    public StepDefinitions search() {
        getSendKeyElement(SEARCH, "The Circus");
        clickElement(SEARCH_THE_CIRCUS);
        return this;
    }

}
