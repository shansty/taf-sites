package by.itacademy.anastasiyashirochina.taf.sites.steps;

import by.itacademy.anastasiyashirochina.taf.sites.pages.DominosPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosStep {
    DominosPage dominosPage;
    public DominosStep(ChromeDriver driver) {
        dominosPage = new DominosPage(driver);
    }
     public void fillFormWithEmailPasswordAndSubmit(String email, String password) {
        dominosPage.openURL();
        dominosPage.closePopUpSelector();
        dominosPage.submitEnterButton();
        dominosPage.inputEmail(email);
        dominosPage.inputPassword(password);
        dominosPage.submitSignInButton();
    }
}
