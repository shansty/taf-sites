package by.itacademy.anastasiyashirochina.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get("https://www.pizzatempo.by/");
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndPassword() {
        pizzatempoPage.clickSubmitSignInButton();
    }

    @Test
    public void testPizzatempoWithIncorrectEmail() {
        pizzatempoPage.sendKeysInputEmail(PizzatempoPage.generatePasswordOrIncorrectEmail(6));
        pizzatempoPage.clickSubmitSignInButton();
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndSomePassword() {
        pizzatempoPage.sendKeysInputPassword(PizzatempoPage.generatePasswordOrIncorrectEmail(8));
        pizzatempoPage.clickSubmitSignInButton();
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndEmptyPassword() {
        pizzatempoPage.sendKeysInputEmail(PizzatempoPage.generateEmail(9));
        pizzatempoPage.clickSubmitSignInButton();
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndPassword() {
        pizzatempoPage.sendKeysInputEmail(PizzatempoPage.generateEmail(5));
        pizzatempoPage.sendKeysInputPassword(PizzatempoPage.generatePasswordOrIncorrectEmail(6));
        pizzatempoPage.clickSubmitSignInButton();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
