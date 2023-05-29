package by.itacademy.anastasiyashirochina.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    private String closePopUpXpath = "//button[@data-test-type = 'close']";
    private String submitEnterButtonXpath = "//button[@data-test-type = 'login']";
    private String inputEmailXpath = "//input[@name='email']";
    private String inputPasswordXpath = "//input[@name='password']";
    private String submitSignInButtonXpath = "//button[@type='submit']";
    private String baseURL = "https://dominos.by/";
    private ChromeDriver driver;
    public DominosPage(ChromeDriver driver) {
        this.driver = driver;;
    }
    public void openURL() {
        driver.get(baseURL);
    }
    public void closePopUpSelector(){
        WebElement closePopUp = driver.findElement(By.xpath(closePopUpXpath));
        closePopUp.click();
    }
    public void submitEnterButton(){
        WebElement submitEnterButton = driver.findElement(By.xpath(submitEnterButtonXpath));
        submitEnterButton.click();
    }
    public void inputEmail(String email){
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys(password);
    }
    public void submitSignInButton() {
        WebElement submitSignInButton = driver.findElement(By.xpath(submitSignInButtonXpath));
        submitSignInButton.click();
    }
}
