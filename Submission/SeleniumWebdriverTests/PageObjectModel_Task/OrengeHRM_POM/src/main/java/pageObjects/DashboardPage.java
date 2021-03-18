package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By WelcomeAdmin = By.
    private By logout = By.linkText("Logout");

    public void clickWelcomeAdmin() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(WelcomeAdmin).click();
    }
    public LoginPage clickLogout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage();
    }
}
