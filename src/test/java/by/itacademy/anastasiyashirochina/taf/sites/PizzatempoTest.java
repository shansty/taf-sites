package by.itacademy.anastasiyashirochina.taf.sites;

import by.itacademy.anastasiyashirochina.taf.sites.pages.PizzatempoPage;
import by.itacademy.anastasiyashirochina.taf.sites.steps.PizzatempoStep;
import by.itacademy.anastasiyashirochina.taf.sites.utils.Util;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoStep pizzatempoStep;
    PizzatempoPage pizzatempoPage;
    Faker faker;
    Util util;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        pizzatempoStep = new PizzatempoStep(driver);
        faker = new Faker();
        util = new Util();
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndPassword() {

        pizzatempoStep.fillFormWithEmptyData();
        Assertions.assertEquals(pizzatempoPage.alertExpectedMessage, pizzatempoPage.getAlertMessage());
    }

    @Test
    public void testPizzatempoWithIncorrectEmail() {
        pizzatempoStep.fillFormWithEmailAndEmptyPassword(util.generatePasswordOrIncorrectEmail());
        Assertions.assertEquals(pizzatempoPage.alertExpectedMessage, pizzatempoPage.getAlertMessage());
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndSomePassword()  {
        pizzatempoStep.fillFormWithPasswordAndEmptyEmail(util.generatePasswordOrIncorrectEmail());
        Assertions.assertEquals(pizzatempoPage.alertExpectedMessage, pizzatempoPage.getAlertMessage());
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndEmptyPassword() {
        pizzatempoStep.fillFormWithEmailAndEmptyPassword(util.generateEmail());
        Assertions.assertEquals(pizzatempoPage.alertExpectedMessage, pizzatempoPage.getAlertMessage());

    }

    @Test
    public void testPizzatempoWithCorrectEmailAndPassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit(util.generateEmail(), util.generatePasswordOrIncorrectEmail());
        Assertions.assertEquals(pizzatempoPage.popUpExpectedMessage, pizzatempoPage.getPopUpMessage());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
