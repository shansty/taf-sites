package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver = new ChromeDriver();
    PizzatempoPage pizzatempoPage = new PizzatempoPage();
    @BeforeEach
    public void testPreparing(){
        driver.get("https://www.pizzatempo.by/");
    }
@Test
    public void testPizzatempoWithEmptyEmailAndPassword(){
    WebElement submitSignInButton = driver.findElement(By.xpath(pizzatempoPage.submitSignInButtonXpath));
    submitSignInButton.click();
}
    @Test
    public void testPizzatempoWithIncorrectEmail() {
        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("email");
        WebElement submitSignInButton = driver.findElement(By.xpath(pizzatempoPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }
    @Test
    public void testPizzatempoWithEmptyEmailAndSomePassword() {
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitSignInButton = driver.findElement(By.xpath(pizzatempoPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }
    @Test
    public void testPizzatempoWithCorrectEmailAndEmptyPassword() {
        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement submitSignInButton = driver.findElement(By.xpath(pizzatempoPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }
    @Test
    public void testPizzatempoWithCorrectEmailAndPassword() {
        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitSignInButton = driver.findElement(By.xpath(pizzatempoPage.submitSignInButtonXpath));
        submitSignInButton.click();
    }
@AfterEach
    public void closeDriver(){
        driver.quit();
}
}
