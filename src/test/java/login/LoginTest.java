package login;

import constants.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Login;


public class LoginTest extends BaseTest {

    @Parameters({"email"})
    @Test
    public void testValidLoginAndInvalidLogin(String email) {
        Login login = new Login(driver);
        login.clickLoginButton();
        login.as(email,"mamtasiyak1@");
        Assert.assertEquals(login.getLoginMessage(), "Logged in successfully", "Validate successful login");
//        String logoutSuccessMessage  = login.logout();
//        Assert.assertEquals(logoutSuccessMessage, "Signed out successfully.","Validate successful logout");
    }

}
