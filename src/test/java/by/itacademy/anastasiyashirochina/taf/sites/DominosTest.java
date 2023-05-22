package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver = new ChromeDriver();
    DominosPage dominosPage = new DominosPage();

    @BeforeEach
    public void testPreparing() {
        driver.get("https://dominos.by/");
        WebElement closePopUp = driver.findElement(By.cssSelector(dominosPage.closePopUpSelector));
        closePopUp.click();
    }

    @Test
    public void testDominosWithIncorrectEmailAndEmptyPassword() {
        WebElement submitEnterButton = driver.findElement(By.xpath(dominosPage.submitEnterButtonXpath));
        submitEnterButton.click();
        WebElement inputEmail = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmail.sendKeys("email");
        WebElement inputPassword = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitSignInButton = driver.findElement(By.xpath(dominosPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }

    @Test
    public void testDominosWithCorrectEmailAndEmptyPassword() {
        WebElement submitEnterButton = driver.findElement(By.xpath(dominosPage.submitEnterButtonXpath));
        submitEnterButton.click();
        WebElement inputEmail = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement inputPassword = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitSignInButton = driver.findElement(By.xpath(dominosPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}
