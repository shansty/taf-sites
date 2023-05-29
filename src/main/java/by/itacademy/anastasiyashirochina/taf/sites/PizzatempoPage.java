package by.itacademy.anastasiyashirochina.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    private String inputEmailName = "astroauth_login";
    private String inputPasswordName = "astroauth_pass";
    private String submitSignInButtonName = "astroauth_submit";
    private String baseURL = "https://www.pizzatempo.by/";
    private ChromeDriver driver;

    public PizzatempoPage(ChromeDriver driver) {
        this.driver = driver;
    }
    public void openURL() {
        driver.get(baseURL);
    }

    public void clickSubmitSignInButton() {
        WebElement submitSignInButton = driver.findElement(By.name(submitSignInButtonName));
        submitSignInButton.click();
    }

    public void sendKeysInputEmail(String email) {
        WebElement inputEmail = driver.findElement(By.name(inputEmailName));
        inputEmail.sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        WebElement inputPassword = driver.findElement(By.name(inputPasswordName));
        inputPassword.sendKeys(password);
    }
}
























