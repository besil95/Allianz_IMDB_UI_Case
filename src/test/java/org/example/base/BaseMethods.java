package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseMethods {

    WebDriver driver = null;
    WebDriverWait wait = null;

    public BaseMethods(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void clickJS(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement OSCARS_BUTTON = driver.findElement(By.xpath("//span[@class='ipc-list-item__text' and text()='Oscars']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", OSCARS_BUTTON);//by ile locator cagirinca tiklamiyordu mecbur statik kullanmak zorunda kalcim
    }


    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }


    public WebElement checkVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public void getSendKeyElement(By by, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }


    public void switchWindow() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void scrollElement(String scroll) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + scroll + ")");
    }

    public void scrollJS(By by) {
        WebElement CIRCUS = driver.findElement(By.xpath("//a[text()='The Circus']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", CIRCUS);
    }

    public String getText(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }
}
