package by.itacademy.anastasiyashirochina.taf.sites;

import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoStep {
    PizzatempoPage page;
    public PizzatempoStep(ChromeDriver driver){
        page = new PizzatempoPage(driver);
    }
    public void fillFormWithEmailPasswordAndSubmit(String email, String password) {
        page.openURL();
        page.sendKeysInputEmail(email);
        page.sendKeysInputPassword(password);
        page.clickSubmitSignInButton();
    }
    public void fillFormWithEmail(String email) {
        page.openURL();
        page.sendKeysInputEmail(email);
        page.clickSubmitSignInButton();
    }
}
