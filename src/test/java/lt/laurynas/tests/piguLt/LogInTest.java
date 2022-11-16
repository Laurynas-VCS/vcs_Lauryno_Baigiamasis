package lt.laurynas.tests.piguLt;

import lt.laurynas.pages.piguLt.LogInPage;
import lt.laurynas.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LogInPage.open("https://pigu.lt/lt/");
        LogInPage.clickPrisijungtiIcon();
    }

    @Test
    private void logInWithValidInput() {

        String actualEmailAddress = "xiyace5563@lance7.com";
        String actualPassword = "VCS123";
        String expectedText = "xiyace5563@lance7.com";
        String actualText = "";

        LogInPage.inputEmailAddress(actualEmailAddress);
        LogInPage.inputPassword(actualPassword);
        LogInPage.clickPrisijungti();
        actualText = LogInPage.checkElementText();


        Assert.assertEquals(actualText, expectedText);


    }

    @Test
    private void logInWithInvalidInput() {

        String actualEmailAddress = "vardenis@gmail.com";
        String actualPassword = "VCS123";
        String expectedMessage = "Neteisingi prisijungimo duomenys";
        String actualMessage = "";

        LogInPage.inputEmailAddress(actualEmailAddress);
        LogInPage.inputPassword(actualPassword);
        LogInPage.clickPrisijungti();
        actualMessage = LogInPage.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    private void logout() {
        String actualEmailAddress = "xiyace5563@lance7.com";
        String actualPassword = "VCS123";
        String expectedText = "Prisijungti";
        String actualText = "";

        LogInPage.inputEmailAddress(actualEmailAddress);
        LogInPage.inputPassword(actualPassword);
        LogInPage.clickPrisijungti();
        LogInPage.moveToProfileIcon();
        LogInPage.clickAtsijungti();

        actualText = LogInPage.checkText();

        Assert.assertEquals(actualText, expectedText);

    }
}

