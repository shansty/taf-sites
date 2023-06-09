package by.itacademy.anastasiyashirochina.taf.sites.steps;

import by.itacademy.anastasiyashirochina.taf.sites.pages.PizzatempoPage;
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
        page.getPopUpMessage();
    }
    public void fillFormWithEmailAndEmptyPassword(String email) {
        page.openURL();
        page.sendKeysInputEmail(email);
        page.clickSubmitSignInButton();
        page.getAlertMessage();
    }
    public void fillFormWithPasswordAndEmptyEmail( String password) {
        page.openURL();
        page.sendKeysInputPassword(password);
        page.clickSubmitSignInButton();
        page.getAlertMessage();
    }
    public void fillFormWithEmptyData() {
        page.openURL();
        page.clickSubmitSignInButton();
        page.getAlertMessage();
    }
}
