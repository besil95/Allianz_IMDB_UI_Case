package org.example.locator;

import org.openqa.selenium.By;

public class IMDBLocators {

    public static final By MENU = By.xpath("//div[@class='ipc-button__text' and text()='Menu']");
    public static final By AWARDS = By.xpath("//span[text()='Awards & Events']");
    public static final By OSCARS = By.xpath("//span[@class='ipc-list-item__text' and text()='Oscars']");
    public static final By EVENT_HISTORY = By.xpath("//h3[text()='Event History']");
    public static final By DATE_1929 = By.xpath("//a[text()='1929']");
    public static final By HONORARY_AWARD = By.xpath("//div[@class='event-widgets__award-name' and text()='Honorary Award']");
    public static final By THE_CIRCUS = By.xpath("//a[text()='The Circus']");
    public static final By DIRECTOR = By.xpath("(//ul[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt']//a[text()='Charles Chaplin'])[1]");
    public static final By WRITER = By.xpath("(//ul[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt']//a[text()='Charles Chaplin'])[2]");
    public static final By STARS = By.xpath("(//ul[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt']//a[text()='Charles Chaplin'])[3]");
    public static final By IMDB = By.id("home_img_holder");
    public static final By SEARCH = By.id("suggestion-search");
    public static final By SEARCH_THE_CIRCUS = By.xpath("//a[@class='searchResults__Result-sc-1pmqwbq-0 kyROKQ _3CzPBqlWRmSAoWxtvQQ5Eo _2xcsB5_XEiRCOYGbWQ05C9']//div[text()='The Circus']");

}
