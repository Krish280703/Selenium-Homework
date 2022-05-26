package Selenium_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Driver_Homework {
    public static void main(String[] args) {

        //This is for Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");

        //This is for Microsoft Edge
        System.setProperty("webdriver.edge.driver","C:\\Users\\krish\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        WebDriver driverEdge = new EdgeDriver();
        driverEdge.get("https://demo.nopcommerce.com");

        //This is for FireFox
        System.setProperty("webdriver.gecko.driver","C:\\Users\\krish\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driverFirefox = new FirefoxDriver();
        driverFirefox.get("https://demo.nopcommerce.com");


    }
}