import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(ExtentTestNGITestListener.class)

public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = "Testing the login functionality , Testing login functionality using test data provided")
    public void loginTest() throws InterruptedException {
      loginPage.clickLoginIcon();
      loginPage.setUsername();
      loginPage.setPassword("choochoo");
      loginPage.clickLoginButton();
      assertEquals(loginPage.getCorrectName().getText(), "dino");
    }
    @Test(description = "Testing the negative login functionality without user name")
    public void negativeLoginTest() throws InterruptedException {
        loginPage.clickLoginIcon();
        loginPage.setPassword("choochoo");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getLoginError().getText(), "Please fill in the username!");
    }
    @Test(description = "Testing the login functionality , Testing login functionality using test data provided")
    public void negativeLoginTest1() throws InterruptedException {
        loginPage.clickLoginIcon();
        loginPage.setIncorrectName();
        loginPage.setPassword("choochoo");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getIncorrectName().getText(), "Incorrect username or password!");
    }

    @Test(description = "Testing the negative password functionality ")
    public void negativeLoginTest2() throws InterruptedException {
        loginPage.clickLoginIcon();
        loginPage.setUsername();
        loginPage.setPassword("abchoo");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getIncorrectPassword().getText(), "Incorrect username or password!");
    }
    @Test(description = "Testing the negative password functionality without pass ")
    public void negativeLoginTest3() throws InterruptedException {
        loginPage.clickLoginIcon();
        loginPage.setUsername();
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getOutPassword().getText(), "Please fill in the password!");
    }


}
