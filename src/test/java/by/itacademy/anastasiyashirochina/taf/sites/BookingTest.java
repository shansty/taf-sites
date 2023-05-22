package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookingTest {
    ChromeDriver driver;
    BookingPage bookingPage = new BookingPage();

    @BeforeEach
    public void testPreparing() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-cache");
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        Thread.sleep(1000);
        WebElement closePopUp = driver.findElement(By.cssSelector(bookingPage.submitSignInAndRegistrationPopUpSelector));
        closePopUp.click();
    }


    @Test
    public void testBookingWithEmptyEmail() {
       WebElement submitButtonEnter = driver.findElement(By.xpath(bookingPage.submitButtonEnterXpath));
       submitButtonEnter.click();
        WebElement submitEmailButton = driver.findElement(By.xpath(bookingPage.submitEmailButtonXpath));
        submitEmailButton.click();
    }

    @Test
    public void testBookingWithIncorrectEmail() {
        WebElement submitButtonEnter = driver.findElement(By.xpath(bookingPage.submitButtonEnterXpath));
        submitButtonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("email");
        WebElement submitEmailButton = driver.findElement(By.xpath(bookingPage.submitEmailButtonXpath));
        submitEmailButton.click();
    }

    @Test
    public void testBookingWithCorrectEmail() {
        WebElement submitButtonEnter = driver.findElement(By.xpath(bookingPage.submitButtonEnterXpath));
        submitButtonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement submitEmailButton = driver.findElement(By.xpath(bookingPage.submitEmailButtonXpath));
        submitEmailButton.click();
    }

    @Test
    public void testBookingWithCorrectEmailAndEmptyPassword() throws InterruptedException {
        WebElement submitButtonEnter = driver.findElement(By.xpath(bookingPage.submitButtonEnterXpath));
        submitButtonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement submitEmailButton = driver.findElement(By.xpath(bookingPage.submitEmailButtonXpath));
        submitEmailButton.click();
        Thread.sleep(1000);
        WebElement submitPasswordButton = driver.findElement(By.xpath(bookingPage.submitPasswordXpath));
        submitPasswordButton.click();
    }
    @Test
    public void testBookingWithCorrectEmailAndCorrectPassword() throws InterruptedException {
        WebElement submitButtonEnter = driver.findElement(By.xpath(bookingPage.submitButtonEnterXpath));
        submitButtonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement submitEmailButton = driver.findElement(By.xpath(bookingPage.submitEmailButtonXpath));
        submitEmailButton.click();
        Thread.sleep(1000);
        WebElement inputPassword = driver.findElement(By.xpath(bookingPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitPasswordButton = driver.findElement(By.xpath(bookingPage.submitPasswordXpath));
        submitPasswordButton.click();
    }
    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}
