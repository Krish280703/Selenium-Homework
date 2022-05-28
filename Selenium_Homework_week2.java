package Selenium_Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Homework_week2 {
    public static void main(String[] args) {
        // For Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("krish2807@yahoo.co.uk");
        driver.findElement(By.id("Password")).sendKeys("Krish280703@");
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();

        //driver.findElement(By.partialLinkText("Apply for vendor account")).click();

        //For Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.nopcommerce.com/");
        driver1.findElement(By.className("ico-login")).click();
        driver1.findElement(By.id("Email")).sendKeys("krish2807@yahoo.co.uk");
        driver1.findElement(By.id("Password")).sendKeys("Krish280703@");
        driver1.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();

        //For Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://demo.nopcommerce.com/");
        driver2.findElement(By.className("ico-login")).click();
        driver2.findElement(By.id("Email")).sendKeys("krish2807@yahoo.co.uk");
        driver2.findElement(By.id("Password")).sendKeys("Krish280703@");
        driver2.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();


    }
}
