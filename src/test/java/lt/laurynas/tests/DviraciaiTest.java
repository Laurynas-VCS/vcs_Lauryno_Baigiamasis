package lt.laurynas.tests;

import lt.laurynas.pages.DviraciaiPage;
import lt.laurynas.pages.Locators;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DviraciaiTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        DviraciaiPage.open("https://pigu.lt/lt/dviraciai");
    }

    @Test
    private void puttingChoosenMerchandiseToBuyingCart() {

        String expectedText = "Užsakymo suma";
        String actualText = "";

        DviraciaiPage.clickAtsiimkiteSiandien();
        DviraciaiPage.clickRekomenduojamasUgis();
        DviraciaiPage.sleep(5000);
        DviraciaiPage.clickToOpenProductPage();
        DviraciaiPage.clickIKrepseli();
        DviraciaiPage.clickPirkti();
        actualText = DviraciaiPage.checkText();

        Assert.assertEquals(actualText,expectedText);


    }
}
