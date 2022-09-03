package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String basUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

    public void setUp(){

        openBrowser(basUrl);
    }
    @Test
    public void UserShouldNavigateToForgotPasswordPageSuccessfully (){

        //* Verify the text ‘Forgot Your Password?’

        getTextFromElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));

        //* click on the ‘Forgot your password’ link

        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']"));



    }

    @After
    public void tearDown(){

        // closeBrowser();
    }

}
