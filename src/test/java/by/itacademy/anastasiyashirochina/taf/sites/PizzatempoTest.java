package by.itacademy.anastasiyashirochina.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoStep pizzatempoStep;
    Faker faker;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoStep = new PizzatempoStep(driver);
        faker = new Faker();
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndPassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit("", "");
    }

    @Test
    public void testPizzatempoWithIncorrectEmail() {
        pizzatempoStep.fillFormWithEmail(faker.internet().password());
    }

    @Test
    public void testPizzatempoWithEmptyEmailAndSomePassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit("", faker.internet().password());
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndEmptyPassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit(faker.internet().emailAddress(), "");
    }

    @Test
    public void testPizzatempoWithCorrectEmailAndPassword() {
        pizzatempoStep.fillFormWithEmailPasswordAndSubmit(faker.internet().emailAddress(), faker.internet().password());
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
