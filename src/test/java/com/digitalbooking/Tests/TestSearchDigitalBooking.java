package com.digitalbooking.Tests;

import com.digitalbooking.Pages.PageSearchDigitalBooking;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestSearchDigitalBooking {
    private WebDriver driver;
    PageSearchDigitalBooking pageSearchDB;

    @BeforeEach
    public void setUp() throws Exception {
        pageSearchDB = new PageSearchDigitalBooking();
        driver = pageSearchDB.chromeDriverConnection();
        pageSearchDB.goToLink("http://testing.ctd.academy/");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        pageSearchDB.searchByCity("Punta del Este");
        pageSearchDB.validateRes();
    }
}
