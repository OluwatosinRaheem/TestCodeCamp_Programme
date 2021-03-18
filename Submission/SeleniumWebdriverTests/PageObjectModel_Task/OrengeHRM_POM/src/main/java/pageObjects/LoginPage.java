import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="txtUsername")
    WebElement userName;
    @FindBy(name = "txtPassword")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\\\"divLogo\\\"]/img")
    WebElement logo;
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
public boolean validateLogo(){
        logo.isDisplayed();
        return true;
}
}
