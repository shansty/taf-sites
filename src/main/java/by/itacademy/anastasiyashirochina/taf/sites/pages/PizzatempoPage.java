package by.itacademy.anastasiyashirochina.taf.sites.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    private String inputEmailName = "astroauth_login";
    private String inputPasswordName = "astroauth_pass";
    private String submitSignInButtonName = "astroauth_submit";
    private String baseURL = "https://www.pizzatempo.by/";
    private ChromeDriver driver;
    private String alertXpath = "//div[@class = 'popupContent']";
    public String popUpExpectedMessage = "Неверно указано имя пользователя или пароль.\n"+ "Ok";
    public String alertExpectedMessage = "Заполните форму";


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

    public String getPopUpMessage() {
        WebElement alertMessage = driver.findElement(By.xpath(alertXpath));
        String popUpText = alertMessage.getText();
        return popUpText;
    }


    public String getAlertMessage() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        return alertText;
    }
}
























