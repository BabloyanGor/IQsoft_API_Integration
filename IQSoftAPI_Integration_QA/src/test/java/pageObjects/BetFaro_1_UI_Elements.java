package pageObjects;//package pageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//
//import java.awt.*;
//
//public class BetFaro_1_UI_Elements extends BasePage {
//    private final BasePage basePage;
//
//    public BetFaro_1_UI_Elements(WebDriver driver) throws AWTException {
//        super(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @FindBy(xpath = "//input[@id='inputUsername']")
//    @CacheLookup
//    WebElement username;
//
//    public void sendKeysUsername(String Username) {
//        try {
//            basePage.sendKeysIfElementVisible(username,Username);
//        } catch (Exception e) {
//        }
//    }
//
//
//    @FindBy(xpath = "//input[@id='inputPassword']")
//    @CacheLookup
//    WebElement password;
//
//    public void sendKeysPassword(String Password) {
//        try {
//            basePage.sendKeysIfElementVisible(password,Password);
//        } catch (Exception e) {
//        }
//    }
//
//
//
//
//
//
//
//
//
//}
//
//
//
