package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    static final String XPATH_FNU = "//div[contains(@class, \"_6ltg\")]//a[contains(@class, \"_42ft\")]";
    static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        //Selenium nie współgra z moim chromem, dlatego zadanie jest na firefox
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com//");

        WebElement selectNewUser = driver.findElement(By.xpath(XPATH_FNU));
        selectNewUser.click();

        //Nie mam informacji o cookies ze strony facebook więc nie wiem kiedy i jak ją dodać
        Thread.sleep(500);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectFormDay = new Select(selectDay);
        selectFormDay.selectByIndex(5);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectFormMonth = new Select(selectMonth);
        selectFormMonth.selectByIndex(5);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectFormYear = new Select(selectYear);
        selectFormYear.selectByIndex(5);
    }
}