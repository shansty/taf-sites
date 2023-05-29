package by.itacademy.anastasiyashirochina.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosStep dominosStep;
    Faker faker;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        dominosStep = new DominosStep(driver);
        faker = new Faker();
    }

    @Test
    public void testDominosWithIncorrectEmailAndEmptyPassword() {
        dominosStep.fillFormWithEmailPasswordAndSubmit(faker.internet().password(), "");
    }

    @Test
    public void testDominosWithCorrectEmailAndEmptyPassword() {
        dominosStep.fillFormWithEmailPasswordAndSubmit(faker.internet().emailAddress(), "");
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
