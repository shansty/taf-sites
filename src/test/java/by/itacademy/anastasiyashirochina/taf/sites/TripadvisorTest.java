package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripadvisorTest {
    ChromeDriver driver = new ChromeDriver();
    TripadvisorPage tripadvisorPage = new TripadvisorPage();

    @BeforeEach
    public void warmUp(){
        driver.get("https://www.tripadvisor.com/");
    }

    @Test
    public void testTripadvisorWithEmptyEmailAndPassword() throws InterruptedException {
        WebElement submitSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitSignInButtonXpath));
        submitSignInButton.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        WebElement submitContinueWithEmailButton = driver.findElement(By.xpath(tripadvisorPage.submitContinueWithEmailButtonXpath));
        submitContinueWithEmailButton.click();
        WebElement submitFinalSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitFinalSignInButtonXpath));
        submitFinalSignInButton.click();
    }

    @Test
    public void testTripadvisorWithIncorrectEmail() throws InterruptedException {
        WebElement submitSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitSignInButtonXpath));
        submitSignInButton.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        WebElement submitContinueWithEmailButton = driver.findElement(By.xpath(tripadvisorPage.submitContinueWithEmailButtonXpath));
        submitContinueWithEmailButton.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("email");
        WebElement submitFinalSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitFinalSignInButtonXpath));
        submitFinalSignInButton.click();
    }

    @Test
    public void testTripadvisorWithCorrectEmailAndEmptyPassword() throws InterruptedException {
        WebElement submitSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitSignInButtonXpath));
        submitSignInButton.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        WebElement submitContinueWithEmailButton = driver.findElement(By.xpath(tripadvisorPage.submitContinueWithEmailButtonXpath));
        submitContinueWithEmailButton.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement submitFinalSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitFinalSignInButtonXpath));
        submitFinalSignInButton.click();
    }

    @Test
    public void testTripadvisorWithCorrectEmailPassword() throws InterruptedException {
        WebElement submitSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitSignInButtonXpath));
        submitSignInButton.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        WebElement submitContinueWithEmailButton = driver.findElement(By.xpath(tripadvisorPage.submitContinueWithEmailButtonXpath));
        submitContinueWithEmailButton.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");
        WebElement inputPassword = driver.findElement(By.xpath(tripadvisorPage.inputPasswordXpath));
        inputPassword.sendKeys("some password");
        WebElement submitFinalSignInButton = driver.findElement(By.xpath(tripadvisorPage.submitFinalSignInButtonXpath));
        submitFinalSignInButton.click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
