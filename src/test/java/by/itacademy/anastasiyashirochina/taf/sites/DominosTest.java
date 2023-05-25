package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosPage dominosPage;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        dominosPage = new DominosPage(driver);
        driver.get("https://dominos.by/");
        dominosPage.closePopUpSelector();
        dominosPage.submitEnterButton();
    }

    @Test
    public void testDominosWithIncorrectEmailAndEmptyPassword() {
        dominosPage.inputEmail(DominosPage.generatePasswordOrIncorrectEmail(4));
        dominosPage.inputPassword(DominosPage.generatePasswordOrIncorrectEmail(5));
        dominosPage.submitSignInButton();
    }

    @Test
    public void testDominosWithCorrectEmailAndEmptyPassword() {
        dominosPage.inputEmail(DominosPage.generateEmail(9));
        dominosPage.inputPassword(DominosPage.generatePasswordOrIncorrectEmail(8));
        dominosPage.submitSignInButton();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
