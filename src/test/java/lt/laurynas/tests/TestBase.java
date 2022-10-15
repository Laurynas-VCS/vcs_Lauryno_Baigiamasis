package lt.laurynas.tests;

import lt.laurynas.pages.Common;
import lt.laurynas.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}

