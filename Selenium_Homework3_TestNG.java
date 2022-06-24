import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTestNGTestCase {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");
        // For Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void goToItem() {
        System.out.println("Going to Laptop");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
    }
    @Test(priority = 3)
    void addItemToBasket() {
        System.out.println("Add 1 Item to Basket");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }
    @Test(priority = 4)
    void verifyIfDislplayed() throws InterruptedException {
        System.out.println("Check if Item is added");
        Thread.sleep(1000);

        boolean Displayed = driver.findElement(By.xpath("/html/body/div[5]/div/p")).isDisplayed();
        if(Displayed){
            System.out.println("Item was added to basket");
        }
        else{
            System.out.println("Item not added to basket");
        }
    }
    @Test(priority = 6)
    void updateQuantity(){
        driver.findElement(By.className("close")).click();
        driver.findElement(By.className("ico-cart")).click();
        WebElement quantity = driver.findElement(By.className("qty-input"));
        quantity.clear();
        quantity.sendKeys("3");
        driver.findElement(By.id("updatecart")).click();
    }
    @Test(priority = 7)
    void goToCheckOut(){
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
    }
    @Test(priority = 8)
    void checkOutAsGuest(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 9)
    void fillDetails(){
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Jeff");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Bazos");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("JeffBazoz1982@gmail.com");
        driver.findElement(By.cssSelector("#BillingNewAddress_Company")).sendKeys("Amazon");
        Select Country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        Country.selectByVisibleText("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("206 High St");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("GL50 3HF");
        driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber")).sendKeys("01242 224314");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();
    }
    @Test(priority = 10)
    void shipingMethod(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#shipping-method-buttons-container > button")).click();

    }
    @Test(priority = 11)
    void Payment(){
        driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#payment-method-buttons-container > button")).click();
        Select Credit_Card = new Select(driver.findElement(By.id("CreditCardType")));
        Credit_Card.selectByValue("visa");
        driver.findElement(By.id("CardholderName")).sendKeys("jeff bezos");
        driver.findElement(By.id("CardNumber")).sendKeys("12345678956645123");
        Select Exp_Month = new Select(driver.findElement(By.id("ExpireMonth")));
        Select Exp_Year = new Select(driver.findElement(By.id("ExpireYear")));
        Exp_Month.selectByValue("9");
        Exp_Year.selectByValue("2034");
        driver.findElement(By.id("CardCode")).sendKeys("123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#payment-info-buttons-container > button")).click();
    }
    @Test(priority = 12)
    void ConfirmOrder(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#confirm-order-buttons-container > button")).click();
    }
}
