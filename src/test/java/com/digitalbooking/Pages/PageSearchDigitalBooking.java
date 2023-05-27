package com.digitalbooking.Pages;

import com.digitalbooking.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageSearchDigitalBooking extends BasePage {
    By searchBox = By.id("ciudad");
    By btnSearch = By.id("btn-buscador");
    By result = By.className("card-list");

    public void searchByCity(String search) throws InterruptedException {
        write(search, searchBox);
        Thread.sleep(1000);
        pressEnterKey(searchBox);
        click(btnSearch);
        Thread.sleep(3500);
    }

    public void validateRes() {
        String resultText = getText(result);
        System.out.println("Resultado Card value: " + result);
        compareIfContains(resultText, "Villa Kantounes Studio Ostria");
    }
}
