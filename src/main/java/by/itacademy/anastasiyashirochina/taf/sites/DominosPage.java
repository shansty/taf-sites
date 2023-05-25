package by.itacademy.anastasiyashirochina.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    private String closePopUpSelector = "body > div.custom-modal.custom-modal--size-content.custom-modal--padding-none.custom-modal--bg-transparent > div.custom-modal__content-holder > button > span > span.custom-button__content-children > svg";
    private String submitEnterButtonXpath = "//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button";
    private String inputEmailXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input";
    private String inputPasswordXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input";
    private String submitSignInButtonXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button";
    private ChromeDriver driver;
    public DominosPage(ChromeDriver driver) {
        this.driver = driver;;
    }
    public void closePopUpSelector(){
        WebElement closePopUp = driver.findElement(By.cssSelector(closePopUpSelector));
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
