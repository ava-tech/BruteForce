package com.automaton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.quit();


    }

}
