package by.itacademy.anastasiyashirochina.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class PizzatempoPage {
    private String inputEmailXpath = "/html/body/div/div[1]/form/p[1]/input";
    private String inputPasswordXpath = "/html/body/div/div[1]/form/p[2]/input[1]";
    private String submitSignInButtonXpath = "/html/body/div/div[1]/form/p[2]/input[2]";
    private ChromeDriver driver;

    public PizzatempoPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitSignInButton() {
        WebElement submitSignInButton = driver.findElement(By.xpath(submitSignInButtonXpath));
        submitSignInButton.click();
    }

    public void sendKeysInputEmail(String email) {
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys(password);
    }
    public static String generateEmail(int length) {
        String[] strings = {"a", "b", "c", "f", "3", "5", "9"};
        String result = "";
        for (int i = 0; i < length; i++) {
            int j = (int)Math.floor(Math.random() * strings.length);
            result=result + strings[j];
        }
        return result + "@gmail.com";
    }
    public static String generatePasswordOrIncorrectEmail(int length) {
        String[] strings = {"a", "b", "c", "f", "3", "5", "9"};
        String result = "";
        for (int i = 0; i < length; i++) {
            int j = (int)Math.floor(Math.random() * strings.length);
            result=result + strings[j];
        }
        return result;
    }
}
























