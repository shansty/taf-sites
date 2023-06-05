package by.itacademy.anastasiyashirochina.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosStep dominosStep;
    Faker faker;
    Util util;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        dominosStep = new DominosStep(driver);
        faker = new Faker();
        util = new Util();
    }

    @Test
    public void testDominosWithIncorrectEmailAndEmptyPassword() {
        dominosStep.fillFormWithEmailPasswordAndSubmit(util.generatePasswordOrIncorrectEmail(), "");
    }

    @Test
    public void testDominosWithCorrectEmailAndEmptyPassword() {
        dominosStep.fillFormWithEmailPasswordAndSubmit(util.generateEmail(), "");
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
