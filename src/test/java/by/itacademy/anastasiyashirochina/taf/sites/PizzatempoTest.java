package by.itacademy.anastasiyashirochina.taf.sites;

import by.itacademy.anastasiyashirochina.taf.sites.steps.PizzatempoStep;
import by.itacademy.anastasiyashirochina.taf.sites.utils.Util;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoStep pizzatempoStep;
    Faker faker;
    Util util;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoStep = new PizzatempoStep(driver);
        faker = new Faker();
        util = new Util();
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndPassword() {

        pizzatempoStep.fillFormWithEmptyData();
    }

    @Test
    public void testPizzatempoWithIncorrectEmail() {
        pizzatempoStep.fillFormWithEmailAndEmptyPassword(util.generatePasswordOrIncorrectEmail());
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndSomePassword()  {
        pizzatempoStep.fillFormWithPasswordAndEmptyEmail(util.generatePasswordOrIncorrectEmail());
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndEmptyPassword() {
        pizzatempoStep.fillFormWithEmailAndEmptyPassword(util.generateEmail());
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndPassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit(util.generateEmail(), util.generatePasswordOrIncorrectEmail());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
